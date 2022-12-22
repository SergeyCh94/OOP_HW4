import transport.Bus;

public class DriverD <D extends Bus> {
    private final String fio;
    private boolean driverLicense;
    private int experience;

    public DriverD(String fio) {
        if (fio == null || fio.isEmpty() || fio.isBlank()){
            this.fio = "default";
        } else {
            this.fio = fio;
        }
    }

    public void start(D bus){
        System.out.println("Водитель " + getFio() + " управляет автомобилем " + bus.getBrand() + " " + bus.getModel() +
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
