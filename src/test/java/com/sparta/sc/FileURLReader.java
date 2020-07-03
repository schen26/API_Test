package com.sparta.sc;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileURLReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public GhibliFilmPOJO readFilmToJSON(String pathOfFile) {
        GhibliFilmPOJO ghibliFilmPOJO = new GhibliFilmPOJO();
        try {
            if (pathOfFile.contains(".")) {
                ghibliFilmPOJO = objectMapper.readValue(new URL(pathOfFile), GhibliFilmPOJO.class);
            } else if (pathOfFile.contains("\\")) {
                ghibliFilmPOJO = objectMapper.readValue(new File(pathOfFile), GhibliFilmPOJO.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ghibliFilmPOJO;
    }
}
