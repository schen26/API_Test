package com.sparta.sc;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public GhibliFilmPOJO readFilmToJSON(String pathOfFile) {
        GhibliFilmPOJO ghibliFilmPOJO = new GhibliFilmPOJO();
        try {
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            ghibliFilmPOJO = objectMapper.readValue(new File(pathOfFile), GhibliFilmPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ghibliFilmPOJO;
    }
}
