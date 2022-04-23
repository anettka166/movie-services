package movieTheater;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Amc extends Theater implements MovieService {

    private boolean hasVr;
    private Faker faker;
    String[] movies;


    public Amc(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, boolean hasVr) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.hasVr = hasVr;
        faker = new Faker();
        movies = new String [10];
        for (int i = 0; i <10 ; i++) {
            movies[i] = faker.book().title();
        }
    }

    public boolean isHasVr() {
        return hasVr;
    }

    public void setHasVr(boolean hasVr) {
        this.hasVr = hasVr;
    }


    @Override
    public void welcomeCustomers() {
        System.out.println("Welcome to AMC! Hope you have a great time with us".toUpperCase());

    }

    @Override
    public void showAvailableMovies() {


        System.out.println("---------Available movies---------".toUpperCase());
        System.out.println("Movie name                 $price".toUpperCase());
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i+1) + "." + movies[i] +"            $" + Double.valueOf((int)(Math.random()*(25-10)+10)));

        }
    }

    @Override
    public void showAvailableSeats(String movie) {
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].equalsIgnoreCase(movie)){
                System.out.println("available seats for " + movies[i] + ":" +(int)(Math.random()*(80-50)+50));
                return;
            }
        }

    }

    @Override
    public void showTheaterInfo() {
        System.out.println(
                this
        );
    }

    @Override
    public String toString() {
        return "AMC INFO: " +
                "NUMBER OF SEATS: " + getNumberOfSeats() + "\n" +
                "POP CORN: " + isHasPopcorn() +  "\n" +
                "NUMBER OF ROOMS: " + getNumberOfRooms() +  "\n" +
                "NUMBER OF RESTROOMS: " + getNumberOfRestrooms() +  "\n" +
                "3D AVAILABLE: " + isHas3D() +  "\n" +
                "DRINKS: " + isHasDrinks() +  "\n" +
                "HAS VR: " + hasVr + "\n";
    }
}
