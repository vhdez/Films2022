package org.sla;

class FilmsData {

     public static void main(String[] args) {

        BoxOfficeFilm.readAllData();
         //Film film = each of the films inside of allFilm
        for (Film film: Film.getAllFilms()) {
            //film.describeSelf();
            System.out.println(film);
        }
    }
}
