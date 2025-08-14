import java.util.ArrayList;
import java.util.Scanner;

public class BookingDetails extends Booking {

    //calling the constructor into the child class
    public BookingDetails(int floor, String roomNumber, String moduleName, String lecturerName, String courseName, double duration) {
        super(floor, roomNumber, moduleName, lecturerName, courseName, duration);
    }
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<BookingDetails> bookings = new ArrayList<>();

    //this method is responsible for taking in the booking details and then storing it in the arraylist
    public String getBookingDetails() {

        System.out.println("-------------------------------------");
        System.out.println("BOOK A NEW CLASSROOM");
        System.out.println("-------------------------------------");

        System.out.print("Enter floor number (5-8): ");
        floor = scanner.nextInt();
        scanner.nextLine();
        if (floor < 5 || floor > 8) {
            System.out.println("Invalid floor number. Must be between 5 and 8.");
            return "";
        }

        System.out.print("Enter room number (e.g., A101): ");
        roomNumber = scanner.nextLine();

        System.out.print("Enter module name: ");
        moduleName = scanner.nextLine();

        System.out.print("Enter lecturer's name: ");
        lecturerName = scanner.nextLine();

        System.out.print("Enter course name: ");
        courseName = scanner.nextLine();

        System.out.print("Enter lecture duration in hours: ");
        duration = scanner.nextDouble();
        scanner.nextLine();

        BookingDetails newBooking = new BookingDetails(floor, roomNumber, moduleName, lecturerName, courseName, duration);
        bookings.add(newBooking);
        System.out.println("Classroom successfully booked!");


    return "";
    }

    //block of code that is responsible for displaying all booking details
    public void viewAllBookings() {
        System.out.println("-------------------------------------");
        System.out.println("ALL BOOKED CLASSROOMS");
        System.out.println("-------------------------------------");
        if (bookings.isEmpty()) {
            System.out.println("No classrooms have been booked yet.");
        } else {
            for (BookingDetails booking : bookings) {
                System.out.println(booking.BookingReport());
            }
        }
    }
//this code is activated whenthe user decides to clos the program
    public void exitApplication() {
        System.out.println("Exiting the application. Goodbye!");
scanner.close();
    }


}