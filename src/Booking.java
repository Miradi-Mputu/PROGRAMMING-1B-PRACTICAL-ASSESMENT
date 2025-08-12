public abstract class Booking implements iBooking {
    public int floor;
    public String roomNumber;
    public String moduleName;
    public String lecturerName;
    public String courseName;
    public double duration;

    public Booking(int floor, String roomNumber, String moduleName, String lecturerName, String courseName, double duration) {
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.moduleName = moduleName;
        this.lecturerName = lecturerName;
        this.courseName = courseName;
        this.duration = duration;
    }

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

    public String BookingReport() {
        return"\nROOM : " + roomNumber +
                "\n FLOOR: " + floor +
                "\nDURATION: " + duration +
                 "\nMODULE NAME: " + moduleName +
                "\nCOURSE NAME: " + courseName +
                "\nLECTURER: " + lecturerName + "\n";
    }
}
