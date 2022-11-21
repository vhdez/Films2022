package org.sla;

class HomeVideo extends Film {
    // Fields
    private String releaseDate;
    private int allSales;
    private int vhsSales;
    private int dvdSales;
    private int bluraySales;

    // Constructors
    HomeVideo(int rank, String title, int releaseYear, long gross, String releaseDate, int allSales, int vhsSales, int dvdSales, int bluraySales) {
        super(rank, title, releaseYear, gross);
        this.releaseDate = releaseDate;
        this.allSales = allSales;
        this.vhsSales = vhsSales;
        this.dvdSales = dvdSales;
        this.bluraySales = bluraySales;
    }

    // Setters/Getters

    String getReleaseDate() {
        return releaseDate;
    }

    void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    int getAllSales() {
        return allSales;
    }

    void setAllSales(int allSales) {
        this.allSales = allSales;
    }

    int getVhsSales() {
        return vhsSales;
    }

    void setVhsSales(int vhsSales) {
        this.vhsSales = vhsSales;
    }

    int getDvdSales() {
        return dvdSales;
    }

    void setDvdSales(int dvdSales) {
        this.dvdSales = dvdSales;
    }

    int getBluraySales() {
        return bluraySales;
    }

    void setBluraySales(int bluraySales) {
        this.bluraySales = bluraySales;
    }

    // Methods
    public void describeSelf() {
        System.out.println("\"" + this.getTitle() + "\" has Home Video ranking #" + this.getRank() + " from year " + this.getReleaseYear() + " (specifically "+ this.getReleaseDate() + ") grossing $" + this.getGross() + " based on " + this.getAllSales() + " sales");
    }
}
