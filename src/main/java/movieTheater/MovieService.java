package movieTheater;

public interface MovieService {

    //common behaviors for movie theaters

    public abstract void welcomeCustomers();
    void showAvailableMovies();
    void showAvailableSeats(String movie);
    void showTheaterInfo();



}
