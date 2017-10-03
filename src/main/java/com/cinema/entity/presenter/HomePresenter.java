package com.cinema.entity.presenter;

import com.cinema.entity.Movie;
import com.cinema.entity.dao.MovieDAO;
import com.cinema.entity.view.movieview.HomeView;
import com.cinema.entity.view.movieview.MovieView;

import java.util.List;

/**
 * Created by artur on 01.10.2017.
 */
public class HomePresenter {

    private HomeView homeDetails;

    public HomePresenter(HomeView homeDetails) {
        this.homeDetails = homeDetails;
    }


}

