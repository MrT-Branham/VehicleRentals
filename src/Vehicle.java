public class Vehicle {

    private double mileage;
    private String VIN;
    private String state;
    private String location;

    public Vehicle(double mileage, String VIN, String state, String location){
        this.mileage = mileage;
        this.VIN = VIN;
        this.state = state;
        this.location = location;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getVIN() {
        return VIN;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
