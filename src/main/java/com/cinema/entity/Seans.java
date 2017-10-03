package com.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by artur on 30.09.2017.
 */

    @Entity
    @Table(name = "seans")
    public class Seans {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int seans_id;


        @Column(name = "title")
        private String title;

        @Column(name = "date")
        private Date date;

        @Column(name = "place")
        private int place;

        public int getSeans_id() {
            return seans_id;
        }

        public void setSeans_id(int seans_id) {
            this.seans_id = seans_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getPlace() {
            return place;
        }

        public void setPlace(int place) {
            this.place = place;
        }

        @Override
        public String toString() {
            return "seans{" +
                    "seans_id=" + seans_id +
                    ", title='" + title + '\'' +
                    ", date=" + date +
                    ", place=" + place +
                    '}';
        }
    }

