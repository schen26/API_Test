package com.sparta.sc;

import java.util.List;

public class GhibliFilmPOJO {
    private String description;
    private String director;
    private String id;
    private Object length;
    private List<String> locations;
    private List<String> people;
    private String producer;
    private String releaseDate;
    private String rtScore;
    private List<String> species;
    private String title;
    private String url;
    private List<String> vehicles;

    public GhibliFilmPOJO() {
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director;
    }

    public String getId() {
        return id;
    }

    public Object getLength() {
        return length;
    }

    public List<String> getLocations() {
        return locations;
    }

    public List<String> getPeople() {
        return people;
    }

    public String getProducer() {
        return producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRtScore() {
        return rtScore;
    }

    public List<String> getSpecies() {
        return species;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getVehicles() {
        return vehicles;
    }
}
