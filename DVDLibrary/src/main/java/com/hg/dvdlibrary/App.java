/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.dvdlibrary;

import com.hg.dvdlibrary.controller.DVDLibraryController;
import com.hg.dvdlibrary.dao.DVDLibraryFileDao;
import com.hg.dvdlibrary.dao.DVDLibraryDao;
import com.hg.dvdlibrary.ui.UserIOconsoleImpl;
import com.hg.dvdlibrary.ui.DVDLibraryView;
import com.hg.dvdlibrary.ui.UserIO;

/**
 *
 * @author ursul
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOconsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIo);
        DVDLibraryDao myDao = new DVDLibraryFileDao();
        DVDLibraryController controller = new DVDLibraryController(myDao, myView);
            controller.run();
        }
    }

