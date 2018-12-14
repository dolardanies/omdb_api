/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.parcial.bean.Movie;

/**
 *
 *
 * @author 
 */
@Service
public class MovieServicesImpl implements MovieServicios {

    /**
     * 
     */
    @Autowired
    @Qualifier("OmdbMovie")
    Movie movie;

    /**
     *
     */
    @Override
    public String obtenerMovie(String title, int year) throws IOException {
        return movie.obtenerMovie(title, year);
    }
}
