package com.cinema;

import javax.swing.*;

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
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600, 400);


            JLabel info = new JLabel("Wciśnij jakiś przycisk");
            JPanel movieButton = new JPanel();
            JPanel  seansButton= new JPanel();
            JTabbedPane buttonPanel = new JTabbedPane();
            buttonPanel.addTab("Movies", movieButton);
            buttonPanel.addTab("Seans", seansButton);
            add(buttonPanel);
            setVisible(true);
        }
    }



