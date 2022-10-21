package oops.encapsulation;

import oops.encapsulation.Movie;

public class TestMovie {
    public static void main(String[] args) {

        Movie movie = new Movie();
        //movie.movieName = "lord of rings";

        //setup value and got it indirectly
        movie.setMovieName("lord of rings");
        System.out.println(movie.getMovieName());
        movie.test();

        //I want to add 10 years to the given age
        movie.setAge(20);//20 is the given age
        System.out.println(movie.getAge()+10);

    }
}
