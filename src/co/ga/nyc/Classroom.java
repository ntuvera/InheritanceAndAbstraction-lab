package co.ga.nyc;

public class Classroom {
    private int roomNumber;
    private int seats;
    private boolean isAvailable;

    public Classroom(int roomNumber, int seats, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.seats = seats;
        this.isAvailable = isAvailable;
    }

    public boolean reserverRoom(){
        this.isAvailable = false;
        return this.isAvailable;
    }
    public boolean releaseRoom(){
        this.isAvailable = true;
        return this.isAvailable;
    }

}
