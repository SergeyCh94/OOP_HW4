import transport.Passenger;

public class DriverB <B extends Passenger> {
    private final String fio;
    private boolean driverLicense;
    private int experience;

    public DriverB(String fio) {
        if (fio == null || fio.isEmpty() || fio.isBlank()){
            this.fio = "default";
        } else {
            this.fio = fio;
        }
    }

    public void start(B passenger){
        System.out.println("Водитель " + getFio() + " управляет автомобилем " + passenger.getBrand() + " " + passenger.getModel() +
                " и будет участвовать в заезде");
    }

    public void stop(){

    }

    public void refuelCar(){

    }

    public String getFio() {
        return fio;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}