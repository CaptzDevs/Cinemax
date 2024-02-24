package com.navigation;

import com.storage.File;
import com.table.Table;

public class Selection {

    public final File file = new File();
    public Selection(){}

    public void theater(){

        Nav selector = new Nav("Theater",new NavList().adminTheater,1,1);
        int choice = selector.getChoice();

        while (choice > 0) {
            switch (choice) {
                case 1:
                     new Table(file.theater);
                    break;
            
                default:
                    break;
            }

            choice = selector.getChoice();
        }

    }

    public void movie(){

        Nav selector = new Nav("Movie",new NavList().adminTheater,1,1);
        int choice = selector.getChoice();

        while (choice > 0) {
            switch (choice) {
                case 1:
                     new Table(file.movie);
                    break;
            
                default:
                    break;
            }

            choice = selector.getChoice();
        }

    }

    public void round(){

        Nav selector = new Nav("Round",new NavList().adminTheater,1,1);
        int choice = selector.getChoice();

        while (choice > 0) {
            switch (choice) {
                case 1:
                     new Table(file.round);
                    break;
            
                default:
                    break;
            }

            choice = selector.getChoice();
        }

    }

    public void ticket(){

        Nav selector = new Nav("Ticket",new NavList().adminTheater,1,1);
        int choice = selector.getChoice();

        while (choice > 0) {
            switch (choice) {
                case 1:
                     new Table(file.ticket);
                    break;
            
                default:
                    break;
            }

            choice = selector.getChoice();
        }

    }





    
}