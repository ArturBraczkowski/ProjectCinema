package com.cinema;


import com.cinema.entity.Seans;
import com.cinema.entity.dao.SeansDAO;

import java.sql.Date;

/**
 * Created by artur on 30.09.2017.
 */
public class SeansApp {
    public static void main(String[] args) {
        SeansDAO seansDAO = new SeansDAO();
        Seans matrix = new Seans();
        matrix.setTitle("Matrix");
        matrix.setDate(Date.valueOf("2017-10-01"));
        matrix.setPlace(1);

        seansDAO.addSeans(matrix);
        HibernateUtil.getSessionFactory().close();
    }
}
