public abstract class Booking implements iBooking {
    //decleration of attributes
    public int floor;
    public String roomNumber;
    public String moduleName;
    public String lecturerName;
    public String courseName;
    public double duration;

    //setting constructors to the attributes
    public Booking(int floor, String roomNumber, String moduleName, String lecturerName, String courseName, double duration) {
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.moduleName = moduleName;
        this.lecturerName = lecturerName;
        this.courseName = courseName;
        this.duration = duration;
    }
    //here we only have getters because in the application we dont need to set anything
    public int getFloor() {
        return floor;
    }

    public double getDuration() {
        return duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    //method used to display the report in a specfic format
    public String BookingReport() {
        return"\nROOM : " + roomNumber +
                "\n FLOOR: " + floor +
                "\nDURATION: " + duration +
                 "\nMODULE NAME: " + moduleName +
                "\nCOURSE NAME: " + courseName +
                "\nLECTURER: " + lecturerName + "\n";
    }
}
