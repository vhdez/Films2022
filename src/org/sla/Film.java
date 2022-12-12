package org.sla;

import java.util.ArrayList;

class Film {
    // Fields
    private static ArrayList<Film> allFilms = new ArrayList<>();
    private int rank;
    private String title;
    private int releaseYear;
    private long gross;

    // Constructors
    Film(int rank, String title, int releaseYear, long gross) {
        this.rank = rank;
        this.title = title;
        this.releaseYear = releaseYear;
        this.gross = gross;
        allFilms.add(this);
    }

    // Setters/Getters

    public static ArrayList<Film> getAllFilms() {
        return allFilms;
    }

    public static void setAllFilms(ArrayList<Film> allFilms) {
        Film.allFilms = allFilms;
    }

    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getReleaseYear() {
        return releaseYear;
    }

    void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    long getGross() {
        return gross;
    }

    void setGross(long gross) {
        this.gross = gross;
    }

    // Methods
    void describeSelf() {
        System.out.println("THIS IS A FILM: " + title + " " + releaseYear);
    }
}
