package org.sla;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
    public String toString() {
        return "This is a BoxOfficeFilm named" + this.getTitle();
    }

    static void readAllData() {
        Scanner sc = null;
        try {
            File file = new File("TopGrossingFilmsData"); // java.io.File
            sc = new Scanner(file);     // java.util.Scanner
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                int rank = lineScanner.nextInt();
                int peak = lineScanner.nextInt();
                String name = lineScanner.next();
                long gross = lineScanner.nextLong();
                int year = lineScanner.nextInt();
                new BoxOfficeFilm(rank, name,year,gross,peak);
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if (sc != null) sc.close();
        }
    }
}
