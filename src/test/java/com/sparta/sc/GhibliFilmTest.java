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
    void testTitle() {
        Assertions.assertFalse(ghibliFilmPOJO.getTitle().isEmpty());
    }

    @Test
    void testTitleIsString() {
        Assertions.assertTrue(ghibliFilmPOJO.getTitle().matches("[\\w ]+"));
    }

    @Test
    void testProducer() {
        Assertions.assertFalse(ghibliFilmPOJO.getProducer().isEmpty());
    }

    @Test
    void testProducerIsString() {
        Assertions.assertTrue(ghibliFilmPOJO.getProducer().matches("[a-zA-Z ]+"));
    }

    @Test
    void testID() {
        Assertions.assertFalse(ghibliFilmPOJO.getId().isEmpty());
    }

    @Test
    void testIDContainsRightCharacters() {
        Assertions.assertTrue(ghibliFilmPOJO.getId().matches("[a-z0-9\\-]+"));
    }

    @Test
    void testDirector() {
        Assertions.assertFalse(ghibliFilmPOJO.getDirector().isEmpty());
    }

    @Test
    void testDirectorIsString() {
        Assertions.assertTrue(ghibliFilmPOJO.getDirector().matches("[a-zA-Z ]+"));
    }

    @Test
    void testReleaseDate() {
        Assertions.assertFalse(releaseDate.isEmpty());
    }

    @Test
    void testReleaseDateLength() {
        Assertions.assertEquals(4, releaseDate.length());
    }

    @Test
    void testReleaseDateRightRange() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int releaseDateInt = Integer.parseInt(releaseDate);
        Assertions.assertTrue(releaseDateInt <= currentYear && releaseDateInt >= 1985);
    }

    @Test
    void testRtScore() {
        Assertions.assertFalse(score.isEmpty());
    }

    @Test
    void testRtScoreLength() {
        Assertions.assertEquals(2, score.length());
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
    void testSpecies() {
        Assertions.assertTrue(ghibliFilmPOJO.getSpecies().stream().allMatch(n -> n.startsWith("https://")));
    }

    @Test
    void testLocation() {
        Assertions.assertTrue(ghibliFilmPOJO.getLocations().stream().allMatch(n -> n.startsWith("https://")));
    }

    @Test
    void testVehicles() {
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
