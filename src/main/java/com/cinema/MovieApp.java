package com.cinema;

import com.cinema.entity.Movie;
import com.cinema.entity.dao.MovieDAO;

import java.sql.Date;

/**
 * Created by artur on 24.09.2017.
 */
public class MovieApp {
    public static void main(String[] args) {
        MovieDAO movieDAO = new MovieDAO();
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDuration(120);
        matrix.setYear(Date.valueOf("1990-01-01"));
        matrix.setDirector("Wachowsky Brothers");

        Integer movieID = movieDAO.addMovie(matrix);
        //HibernateUtil.getSessionFactory().close();

        Movie dbMovie = movieDAO.getMovie(movieID);
        System.out.println(dbMovie);
    }
}
