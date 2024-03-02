package com;

import com.navigation.NavList;
import com.storage.FileData;

import com.navigation.Nav;
import com.navigation.Selection;

import com.client.Receipt;
import com.client.Ticket;
import com.general.Movie;
import com.general.Round;
import com.general.Theater;

public class Admin {
    public static void main(String[] args) {
        FileData file = new FileData();
        NavList navList = new NavList();

        while (true) {
            Nav adminMenu = new Nav("Cinemax Mannagement", navList.adminMain, 0, 1);

            switch (adminMenu.getChoice()) {
                case 1:
                    new Selection(new Theater().schema,"Theater",file.theater, "TH");
                break;
                case 2:
                    new Selection(new Movie().schema,"Movie",file.movie, "MO");
                break;
                case 3:
                    new Selection().round(new Round().schema,file.round, "RO");
                break;
                case 4:
                    new Selection(new Theater().schema,"Ticket",file.ticket, "TK");
                break;
                case 5:
                    new Selection(new Theater().schema,"Receipt",file.theater, "RE");
                break;
                default:
                   System.exit(0);
                break;
            }
        }
    }
}
