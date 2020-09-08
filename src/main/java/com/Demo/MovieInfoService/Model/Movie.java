package com.Demo.MovieInfoService.Model;

public class Movie {
    private int MovieId;
    private String MovieName;

    public Movie(int movieId, String movieName) {
        MovieId = movieId;
        MovieName = movieName;
    }

    public int getMovieId() {
        return MovieId;
    }

    public void setMovieId(int movieId) {
        MovieId = movieId;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
}
