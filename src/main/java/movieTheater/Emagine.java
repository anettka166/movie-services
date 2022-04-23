package movieTheater;

public class Emagine extends Theater implements MovieService  {

    private String specialEvent;

    public Emagine(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean hasDrinks, String specialEvent) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D, hasDrinks);
        this.specialEvent = specialEvent;
    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
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
