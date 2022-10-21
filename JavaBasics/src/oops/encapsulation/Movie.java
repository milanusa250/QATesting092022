package oops.encapsulation;

public class Movie {

    //data hiding
    private String movieName;
    private String movieRating;
    int number = 100;
    private int age;

    //getter and setter
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //this is a java keyword that refers to a global variable
    public void test(){
        int number = 6;
        System.out.println(this.number);
        //java prioritize the local variable
    }
}
