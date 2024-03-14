import java.util.Scanner;

public class RoomBookingManager {
    private static final int MAX_BOOKINGS = 10;
    private static String[] bookings = new String[MAX_BOOKINGS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book Room");
            System.out.println("2. Check Room Availability");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookRoom(scanner);
                    break;
                case 2:
                    checkRoomAvailability(scanner);
                    break;
                case 3:
                    viewAllBookings();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    private static void bookRoom(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter date (MM/DD/YYYY): ");
        String date = scanner.next();

        // Check if the room is already booked for the given date
        if (isDateAlreadyBooked(date)) {
            System.out.println("Sorry, the room is already booked for " + date);
            return;
        }

        // Find the first available slot in the bookings array
        for (int i = 0; i < MAX_BOOKINGS; i++) {
            if (bookings[i] == null) {
                bookings[i] = name + " - " + date;
                System.out.println("Room booked successfully for " + date + " by " + name);
                return;
            }
        }
        System.out.println("Sorry, the room is fully booked.");
    }

    private static void checkRoomAvailability(Scanner scanner) {
        System.out.print("Enter date to check availability (MM/DD/YYYY): ");
        String date = scanner.next();

        if (isDateAlreadyBooked(date)) {
            System.out.println("The room is not available on " + date);
        } else {
            System.out.println("The room is available on " + date);
        }
    }

    private static void viewAllBookings() {
        System.out.println("\nAll Bookings:");
        for (String booking : bookings) {
            if (booking != null) {
                System.out.println(booking);
            }
        }
    }

    private static boolean isDateAlreadyBooked(String date) {
        for (String booking : bookings) {
            if (booking != null && booking.endsWith(date)) {
                return true;
            }
        }
        return false;
    }
}
