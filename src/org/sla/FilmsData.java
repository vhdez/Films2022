package org.sla;

class FilmsData {

     public static void main(String[] args) {

         // polymorphism: avengers' object has 2 classes: BoxOfficeFilm and Film
         new BoxOfficeFilm(1, "Avengers: Endgame", 2019,2797800564l,1);
         // polymorphism: lionKing's object has 2 classes: HomeVideo and Film
         new HomeVideo(1,"The Lion King", 1995,852000000,"March 3, 1995",47500000,32000000,11900000, 36800000);

         //Film film = each of the films inside of allFilm
        for (Film film: Film.getAllFilms()) {
            film.describeSelf();
        }
    }
}
