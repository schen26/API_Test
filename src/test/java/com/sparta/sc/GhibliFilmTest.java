package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GhibliFilmTest {
    FileURLReader fileReader = new FileURLReader();
    GhibliFilmPOJO ghibliFilmPOJO = fileReader.readFilmToJSON("https://ghibliapi.herokuapp.com/films/58611129-2dbc-4a81-a72f-77ddfc1b1b49");
    //GhibliFilmPOJO ghibliFilmPOJO = fileReader.readFilmToJSON("src\\test\\resources\\GhibliFilm");

    @Test
    void testTitle() {
        Assertions.assertFalse(ghibliFilmPOJO.getTitle().isEmpty());
    }

    @Test
    void testProducer() {
        Assertions.assertFalse(ghibliFilmPOJO.getProducer().isEmpty());
    }

    @Test
    void testID() {
        Assertions.assertFalse(ghibliFilmPOJO.getId().isEmpty());
    }

    @Test
    void testDirector() {
        Assertions.assertFalse(ghibliFilmPOJO.getDirector().isEmpty());
    }

    @Test
    void testReleaseDate() {
        Assertions.assertFalse(ghibliFilmPOJO.getRelease_date().isEmpty());
    }

    @Test
    void testRtScore() {
        Assertions.assertFalse(ghibliFilmPOJO.getRt_score().isEmpty());
    }

    @Test
    void testDescription() {
        Assertions.assertFalse(ghibliFilmPOJO.getDescription().isEmpty());
    }

    @Test
    void testPeople() {
        Assertions.assertTrue(ghibliFilmPOJO.getPeople().get(0).startsWith("https://"));
    }

    @Test
    void testSpecies() {
        Assertions.assertTrue(ghibliFilmPOJO.getSpecies().get(0).startsWith("https://"));
    }

    @Test
    void testLocation() {
        Assertions.assertTrue(ghibliFilmPOJO.getLocations().get(0).startsWith("https://"));
    }

    @Test
    void testVehicles() {
        Assertions.assertTrue(ghibliFilmPOJO.getVehicles().get(0).startsWith("https://"));
    }

    @Test
    void testURL() {
        Assertions.assertTrue(ghibliFilmPOJO.getUrl().startsWith("https://"));
    }

    @Test
    void testLength() {
        Assertions.assertNull(ghibliFilmPOJO.getLength());
    }
}
