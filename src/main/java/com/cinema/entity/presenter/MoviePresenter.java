package com.cinema.entity.presenter;

import com.cinema.entity.Movie;
import com.cinema.entity.dao.MovieDAO;
import com.cinema.entity.view.movieview.MovieView;

import java.util.List;

/**
 * Created by artur on 30.09.2017.
 */
public class MoviePresenter {

    MovieDAO movieDAO = new MovieDAO();
    private MovieView movieDetails;

    public MoviePresenter(MovieView movieDetails) {
        this.movieDetails = movieDetails;
    }


   public void ShowMovieList(){
      List<Movie> movieList= movieDAO.getMovieList();
      movieDetails.setMovieList(movieList);

   }
}

