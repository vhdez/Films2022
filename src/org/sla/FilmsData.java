package org.sla;

import java.util.ArrayList;

class FilmsData {

     public static void main(String[] args) {
         ArrayList<Film> allFilms = new ArrayList<>();
        // write your code here
         allFilms.add(new BoxOfficeFilm(1, "Avengers: Endgame", 2019,2797800564l,1));
         allFilms.add(new HomeVideo(1,"The Lion King", 1995,852000000,"March 3, 1995",47500000,32000000,11900000, 36800000));
         for (Film film: allFilms) {
             film.describeSelf();
         }
    }
}
