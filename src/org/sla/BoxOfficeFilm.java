package org.sla;

class BoxOfficeFilm extends Film {
    // Fields
    private int peak;

    // Constructors
    BoxOfficeFilm(int rank, String title, int releaseYear, long gross, int peak) {
        super(rank, title, releaseYear, gross);
        this.peak = peak;
    }

    // Setters/Getters

    int getPeak() {
        return peak;
    }

    void setPeak(int peak) {
        this.peak = peak;
    }

    // Methods
    void describeSelf() {
        System.out.println("This is a BoxOfficeFilm named" + this.getTitle());
    }
}
