package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class GhibliFilmTest {
    FileURLReader fileReader = new FileURLReader();
    GhibliFilmPOJO ghibliFilmPOJO = fileReader.readFilmToJSON("https://ghibliapi.herokuapp.com/films/58611129-2dbc-4a81-a72f-77ddfc1b1b49");
    //GhibliFilmPOJO ghibliFilmPOJO = fileReader.readFilmToJSON("src\\test\\resources\\GhibliFilm");
    String releaseDate = ghibliFilmPOJO.getRelease_date();
    String score = ghibliFilmPOJO.getRt_score();

    @Test
    void testTitleIsString() {
        Assertions.assertTrue(ghibliFilmPOJO.getTitle().matches("[\\w ]+"));
    }

    @Test
    void testProducerIsString() {
        Assertions.assertTrue(ghibliFilmPOJO.getProducer().matches("[a-zA-Z ]+"));
    }

    @Test
    void testIDContainsRightCharacters() {
        Assertions.assertTrue(ghibliFilmPOJO.getId().matches("[a-z0-9\\-]+"));
    }

    @Test
    void testDirectorIsString() {
        Assertions.assertTrue(ghibliFilmPOJO.getDirector().matches("[a-zA-Z ]+"));
    }

    @Test
    void testReleaseDateLength() {
        Assertions.assertTrue(releaseDate.matches("[\\d]{4}"));
    }

    @Test
    void testReleaseDateRightRange() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int releaseDateInt = Integer.parseInt(releaseDate);
        Assertions.assertTrue(releaseDateInt <= currentYear && releaseDateInt >= 1985);
    }

    @Test
    void testRtScoreLength() {
        Assertions.assertTrue(score.matches("[\\d]{2}"));
    }

    @Test
    void testRtScoreRightRange() {
        int scoreInt = Integer.parseInt(score);
        Assertions.assertTrue(scoreInt <= 100 && scoreInt >= 0);
    }

    @Test
    void testDescription() {
        Assertions.assertFalse(ghibliFilmPOJO.getDescription().isEmpty());
    }

    @Test
    void testAllPeople() {
        Assertions.assertTrue(ghibliFilmPOJO.getPeople().stream().allMatch(n -> n.startsWith("https://")));
    }

    @Test
    void testAllSpecies() {
        Assertions.assertTrue(ghibliFilmPOJO.getSpecies().stream().allMatch(n -> n.startsWith("https://")));
    }

    @Test
    void testAllLocation() {
        Assertions.assertTrue(ghibliFilmPOJO.getLocations().stream().allMatch(n -> n.startsWith("https://")));
    }

    @Test
    void testAllVehicles() {
        Assertions.assertTrue(ghibliFilmPOJO.getVehicles().stream().allMatch(n -> n.startsWith("https://")));
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
