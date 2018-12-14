/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.service;

import java.io.IOException;

/**
 * Servicios expuestos
 *
 * @author 
 */
public interface MovieServicios {

    /**
     *
     * @param title
     * @param year
     * @return 
     * @throws java.io.IOException
     */
    public String obtenerMovie(String title, int year) throws IOException;
}
