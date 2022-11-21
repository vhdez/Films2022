package org.sla;

import java.util.ArrayList;

class Film {
    // Fields
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
    }

    // Setters/Getters

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
        System.out.println("\"" + this.getTitle() + "\" has org.sla.Film ranking #" + this.getRank() + " from year " + this.getReleaseYear() + " grossing $" + this.getGross());
    }

}
