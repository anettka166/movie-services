package movieTheater;

import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------Welcome!---------------".toUpperCase());
        System.out.println("Which movie theater would you like to choose?".toUpperCase());
        System.out.println("amc | regal | ioic | emagine".toUpperCase());
        String theater = scanner.nextLine().toUpperCase();

        MovieService service = null;

        switch (theater) {
            case "AMC":
                service = new Amc(100, true, 5, 2, true, true, true);
                service.welcomeCustomers();

                while (true) {
                    System.out.println("movies | seats | info");
                    String option = scanner.nextLine();

                    if (option.equalsIgnoreCase("movies")) {
                        service.showAvailableMovies();
                    } else if (option.equalsIgnoreCase("seats")) {
                        System.out.println("which movie?".toUpperCase());
                        String movieName = scanner.nextLine();
                        service.showAvailableSeats(movieName);
                    } else if (option.equalsIgnoreCase("info")) {
                        service.showTheaterInfo();
                    }
                else if (option.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Invalid value.Try again".toUpperCase());
            }
        }
                break;

            case"REGAL":
                break;
            case"EMAGINE":
                break;
            case"IPIC":
                break;
        }
























    }
}
