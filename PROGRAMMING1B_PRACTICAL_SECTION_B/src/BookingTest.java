import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;
public class BookingTest {
    @Test
    public void viewAllBookings() {
        System.out.println("Search series - series not found-test");
        List<BookingDetails>listOfSeries = new ArrayList();
        BookingDetails testModel = new BookingDetails();
        testModel.roomNumber = "123";
        testModel.moduleName = "name";
        testModel.lecturerName = "Lux ";
        testModel.courseName = "Prog";
        testModel.duration = Double.parseDouble("1,5");
        listOfSeries.add(testModel);
        BookingDetails instance = new BookingDetails();
        BookingDetails result = instance;
        Assertions.assertNull(result);
    }

    @Test
    public void getBookingDetails() {
        System.out.println("Search series - series not found-test");
        List<BookingDetails>listOfSeries = new ArrayList();
        BookingDetails testModel = new BookingDetails();
        testModel.roomNumber = "123";
        testModel.moduleName = "name";
        testModel.lecturerName = "Lux ";
        testModel.courseName = "Prog";
        testModel.duration = Double.parseDouble("2,3");
        listOfSeries.add(testModel);
        BookingDetails instance = new BookingDetails();
        BookingDetails result = instance;
        Assertions.assertNull(result);
    }
}
