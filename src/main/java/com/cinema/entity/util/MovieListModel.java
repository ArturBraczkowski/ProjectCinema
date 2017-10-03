package com.cinema.entity.util;

/**
 * Created by artur on 01.10.2017.
 */

    import com.cinema.entity.Movie;

    import javax.swing.*;
    import java.util.List;

    public class MovieListModel extends AbstractListModel{

        private List<Movie> listaFilmow;

        public MovieListModel(List<Movie> listaFilmow) {
            this.listaFilmow = listaFilmow;
        }

        @Override
        public int getSize() {
            return listaFilmow.size();
        }

        @Override
        public Object getElementAt(int index) {
            return listaFilmow.get(index);
        }
    }

