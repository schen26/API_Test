package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GhibliFilmTest {
    FileReader fileReader = new FileReader();
    GhibliFilmPOJO ghibliFilmPOJO = fileReader.readFilmToJSON("src\\test\\resources\\GhibliFilm");
    ResponseReader responseReader = new ResponseReader("https://ghibliapi.herokuapp.com/films/58611129-2dbc-4a81-a72f-77ddfc1b1b49");

    @Test
    void testTitle() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getTitle().isEmpty());
    }

    @Test
    void testProducer() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getProducer().isEmpty());
    }

    @Test
    void testID() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getId().isEmpty());
    }

    @Test
    void testDirector() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getDirector().isEmpty());
    }

    @Test
    void testReleaseDate() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getRelease_date().isEmpty());
    }

    @Test
    void testRtScore() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getRt_score().isEmpty());
    }

    @Test
    void testDescription() {
        Assertions.assertEquals(false, ghibliFilmPOJO.getDescription().isEmpty());
    }

    @Test
    void testPeople() {
        Assertions.assertEquals(true, ghibliFilmPOJO.getPeople().get(0).startsWith("https://"));
    }

    @Test
    void testSpecies() {
        Assertions.assertEquals(true, ghibliFilmPOJO.getSpecies().get(0).startsWith("https://"));
    }

    @Test
    void testLocation() {
        Assertions.assertEquals(true, ghibliFilmPOJO.getLocations().get(0).startsWith("https://"));
    }

    @Test
    void testVehicles() {
        Assertions.assertEquals(true, ghibliFilmPOJO.getVehicles().get(0).startsWith("https://"));
    }

    @Test
    void testURL() {
        Assertions.assertEquals(true, ghibliFilmPOJO.getUrl().startsWith("https://"));
    }

    @Test
    void testLength() {
        Assertions.assertEquals(null, ghibliFilmPOJO.getLength());
    }

    @Test
    void testResponseCode() {
        Assertions.assertEquals(200, responseReader.gettingResponseCode());
    }

    @Test
    void testHeaders() {
        Assertions.assertEquals(false, responseReader.gettingHeaders().isEmpty());
    }
}
