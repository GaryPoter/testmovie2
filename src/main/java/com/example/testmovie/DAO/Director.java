package com.example.testmovie.DAO;

public class Director extends Person {
    private Long directMovieId;

    public Director() {
        super();
    }

    public Long getDirectMovieId() {
        return directMovieId;
    }

    public void setDirectMovieId(Long directMovieId) {
        this.directMovieId = directMovieId;
    }
}
