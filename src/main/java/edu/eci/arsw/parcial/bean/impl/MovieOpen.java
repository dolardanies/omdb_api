/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.bean.impl;

import edu.eci.arsw.parcial.Model.HttpConnection;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import edu.eci.arsw.parcial.bean.Movie;

/**
 *
 *
 * @author 
 */
@Service("OpenMovie")
public class MovieOpen implements Movie {

   
    private ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<String, String>();
    Date date = new Date();
    int minutos = 0;

    
    @Override
    public String obtenerMovie(String title, int year) throws IOException {
        String urlData;
        int tiempoTranscurrido = date.getMinutes() - minutos;
        if (cache.containsKey(title) && tiempoTranscurrido < 5) {
            urlData = cache.get(title);
        } else {
            urlData = HttpConnection.getUrlData("http://www.omdbapi.com/?t="+ title +"&y=" + year + "&apikey=fd99deec");
            cache.put(title, urlData);
            minutos = date.getMinutes();
        }
        return urlData;
    }

}
