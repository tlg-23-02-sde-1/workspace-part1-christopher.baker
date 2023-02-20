package net.flix.client;

import net.flix.Movie;
import net.flix.MovieGenre;
import net.flix.MovieRating;

class MovieClient {

    public static void main(String[] args) {
        System.out.println();

        Movie movie1 = new Movie(); //Must provide at least a title
        movie1.setTitle("Shrek");
        movie1.setReleaseYear(2004);
        movie1.setRevenue(491_800_000.03);
        //movie1.getRating();
        //movie1.getGenre();

        System.out.println(movie1);  //toString() automatically called
        System.out.println();

        Movie movie2 = new Movie();
        movie2.setTitle("The Labyrinth");
        movie2.setReleaseYear(1986);
        movie2.setRevenue(34000000.0);

        System.out.println(movie2);
        System.out.println();

        Movie movie3 = new Movie("The Labyrinth", MovieGenre.SCI_FI, 1986, 34_000_000.0, MovieRating.PG);
        System.out.println(movie3);
        System.out.println();

        Movie movie4 = new Movie("Weekend at Bernie's");
        System.out.println(movie4);
        System.out.println();

        Movie movie5 = new Movie("Top Gun", 1986);
        System.out.println(movie5);
        System.out.println();

    }
}