package com.cinema;

import com.cinema.entity.presenter.MoviePresenter;
import com.cinema.entity.view.movieview.MovieView;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by artur on 30.09.2017.
 */

    public class ViewApp extends JFrame {
        public ViewApp() {
            View();


        }

        public static void main(String[] args) {

            ViewApp viewApp = new ViewApp();
            viewApp.setVisible(true);
        }
        private void View() {
            setTitle("Moje Kino");
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    HibernateUtil.getSessionFactory().close();
                    System.exit(0);
                }
            });
            setSize(600, 400);

            MovieView widokFilmu = new MovieView();
            MoviePresenter moviePresenter = new MoviePresenter(widokFilmu);
            JPanel movies = widokFilmu.getContentPanel();
            moviePresenter.ShowMovieList();

            JPanel seansButton= new JPanel();
            JTabbedPane buttonPanel = new JTabbedPane();
            buttonPanel.addTab("Movies", movies);
            buttonPanel.addTab("Seans", seansButton);
            setContentPane(buttonPanel);
            setVisible(true);


        }
    }



