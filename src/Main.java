import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int floor = 0;
        String roomNumber="";
        String moduleName ="";
        String lecturerName="";
        String courseName="";
        double duration=0;

BookingDetails bookingDetails = new BookingDetails(floor, roomNumber, moduleName, lecturerName, courseName, duration);

        System.out.println("-------------------------------------");
        System.out.println("CLASSROOM BOOKING SYSTEM");
        System.out.println("-------------------------------------");

        //Here we made use of a while loop to display the options
        // in the while loop I have inserted if statements that will execute certain bodies of code that are found within the super class
        while (true) {
            System.out.println("\n-------------------------------------");
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Book a classroom");
            System.out.println("(2) View all bookings");
            System.out.println("(3) Exit Application");
            System.out.println("-------------------------------------");
            System.out.print("Enter your choice: ");

            //this body of code restricts user form inserting any other key but the restricted 1-3 options
            //if the user does insert an unrequested key the program will say that it is invalid which it is
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number from the menu.");
                scanner.nextLine();
                continue;
            }
// if the user selects option 1 it will excute the bookClassroom method in the Classroom class and so therefor the other options as well
            if (choice == 1)
                bookingDetails.getBookingDetails();
            else if (choice == 2) {
                bookingDetails.viewAllBookings();
            } else if (choice == 3) {
                bookingDetails.exitApplication();
            } else {
                System.out.println("Invalid option. Please choose a number from 1 to 3.");
            }

        }

    }
}