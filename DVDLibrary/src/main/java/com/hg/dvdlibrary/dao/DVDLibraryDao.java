/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.dvdlibrary.dao;

import com.hg.dvdlibrary.dto.Movie;
import java.util.List;

/**
 *
 * @author ursul
 */
public interface DVDLibraryDao {

    Movie addTitle(String title, Movie movie) throws DVDLibraryDaoException; 
        
    List<Movie> getAllTitles() throws DVDLibraryDaoException;

    Movie getTitle(String title) throws DVDLibraryDaoException;

    Movie removeTitle(String title) throws DVDLibraryDaoException;
    
    void editDvdInfo(String title, Movie movie) throws DVDLibraryDaoException; 
    
    Movie getMovieByTitle(String title) throws DVDLibraryDaoException;
    
}