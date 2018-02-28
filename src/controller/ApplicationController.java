package controller;

import helper.ConnectionManager;
import helper.InputManager;

import java.sql.Connection;

public class ApplicationController {

    public void run() {

        LibraryController libraryController = new LibraryController();
        int option = 0;
        while (!(option == 2)) {
            option = InputManager.getNumber("Type option number: ");
            switch (option) {
                case 1:
                    libraryController.createBook();
                case 2:
                    ConnectionManager.closeConnection(ConnectionManager.newConnection);
                    System.exit(0);
            }
        }
    }
}
