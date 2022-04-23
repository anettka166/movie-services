package movieTheater;

public class Ipic extends Theater implements MovieService  {

    private String dinner;

    public Ipic(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, String dinner) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.dinner = dinner;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    @Override
    public void welcomeCustomers() {

    }

    @Override
    public void showAvailableMovies() {

    }

    @Override
    public void showAvailableSeats(String movie) {

    }

    @Override
    public void showTheaterInfo() {

    }
}
