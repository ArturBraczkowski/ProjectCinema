package com.cinema.entity.view.movieview;

import com.cinema.entity.Movie;
import com.cinema.entity.util.MovieListModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

/**
 * Created by artur on 01.10.2017.
 */
public class MovieView {
    private JList listMenu;
    private JPanel contentPanel;
    private JLabel movieTitle;
    private JLabel movieDirector;
    private JLabel movieDuration;

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public MovieView() {
        init();
    }

    public void setMovieList(List<Movie> listaFilmow) {
        listMenu.setModel(new MovieListModel(listaFilmow));
    }

    private void init() {
        listMenu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listMenu.setCellRenderer(new ListCellRenderer<Movie>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends Movie> list,
                                                          Movie value, int index,
                                                          boolean isSelected,
                                                          boolean cellHasFocus) {
                JLabel listItem = new JLabel(value.getTitle());
                listItem.setOpaque(true);
                if (isSelected)

                {
                    listItem.setBackground(list.getSelectionBackground());
                    listItem.setForeground(list.getSelectionForeground());
                } else {
                    listItem.setBackground(list.getBackground());
                    listItem.setForeground(list.getForeground());
                }
                listItem.setFont(list.getFont());
                listItem.setEnabled(list.isEnabled());
                listItem.setMinimumSize(new Dimension(100, 20));
                return listItem;
            }
        });

        listMenu.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList<Movie> movieList = (JList<Movie>) e.getSource();
                Movie selectedMovie = movieList.getSelectedValue();

                movieTitle.setText(selectedMovie.getTitle());
                movieDuration.setText("" + selectedMovie.getDuration());
                movieDirector.setText(selectedMovie.getDirector());
            }
        });
    }
}