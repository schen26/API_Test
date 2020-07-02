package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GhibliFilmTest {
    FileReader fileReader = new FileReader();
    GhibliFilmPOJO ghibliFilmPOJO = fileReader.readFilmToJSON("src\\test\\resources\\GhibliFilm");

    @Test
    void testTitle() {
        Assertions.assertEquals("My Neighbor Totoro", ghibliFilmPOJO.getTitle());
    }

    @Test
    void testProducer() {
        Assertions.assertEquals("Hayao Miyazaki", ghibliFilmPOJO.getProducer());
    }

    @Test
    void testID() {
        Assertions.assertEquals("58611129-2dbc-4a81-a72f-77ddfc1b1b49", ghibliFilmPOJO.getId());
    }

    @Test
    void testDirector() {
        Assertions.assertEquals("Hayao Miyazaki", ghibliFilmPOJO.getDirector());
    }

    @Test
    void testReleaseDate() {
        Assertions.assertEquals("1988", ghibliFilmPOJO.getReleaseDate());
    }

    @Test
    void testRtScore() {
        Assertions.assertEquals("93", ghibliFilmPOJO.getRtScore());
    }
}
