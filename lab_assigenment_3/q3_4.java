
import java.util.*;

public class q3_4 {
    public static int max_booking = 10;
    public static String[] bookings = new String[max_booking];
    public static void bookroom(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("enter date MM/DD/YYYY");
        String date = sc.nextLine();

        if(Date_booked(date)){
            System.out.println("SORRY, room is already booked");
        }

        for (int i = 0; i < max_booking; i++) {
            if (bookings[i]==null) {
                bookings[i] = name+ " - "+date;
                System.out.println("Room booked successfully for "+date+" by "+name);
                return;
            }
        }
        
        System.out.println("room is fully booked");
        

    }
    public static boolean Date_booked(String date) {
        for (String booking : bookings) {
            if (booking != null && booking.endsWith(date)) {
                return true;
            }
        }
        return false;
    }
    public static void viewAllBookings() {
        System.out.println("\nAll Bookings:");
        for (String booking : bookings) {
            if (booking != null) {
                System.out.println(booking);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book Room");
            System.out.println("2. View All Bookings");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bookroom();
                    break;
                case 2:
                    viewAllBookings();
                    break;
                
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}
