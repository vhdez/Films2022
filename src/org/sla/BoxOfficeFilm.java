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
    public void describeSelf() {
        System.out.println("\"" + this.getTitle() + "\" has Box Office ranking #" + this.getRank() + " from year " + this.getReleaseYear() + " grossing $" + this.getGross() + " and peaking at rank #" + this.getPeak());
    }
}
