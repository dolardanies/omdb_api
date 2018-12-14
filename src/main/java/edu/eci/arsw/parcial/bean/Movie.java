/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.bean;

import java.io.IOException;

/**
 *
 * @author DanielEsteban
 */
public interface Movie {

    /**
     *
     * @param title
     * @param year
     * @return
     * @throws IOException
     */
    public String obtenerMovie(String title, int year) throws IOException;
}
