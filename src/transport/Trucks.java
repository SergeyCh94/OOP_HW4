package transport;

import driver.DriverC;

public class Trucks extends Transport <DriverC>{
    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
}
