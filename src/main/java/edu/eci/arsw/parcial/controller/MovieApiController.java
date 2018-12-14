/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.parcial.service.MovieServicios;

/**
 * 
 * @author 
 */
@RestController
@RequestMapping("/movie")
public class MovieApiController {

    @Autowired
    private MovieServicios ms;

    @RequestMapping(method = RequestMethod.GET, path = "/{title}/{year}")
    public ResponseEntity<?> getMovie(@PathVariable("title") String title, @PathVariable("year") int year) {
        try {
            return new ResponseEntity<>(ms.obtenerMovie(title, year), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al obtenerla data del movie: " + title + " " + year, HttpStatus.NOT_FOUND);
        }
    }
}
