package transport;

import driver.DriverB;

public class Car extends Transport <DriverB>{
    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }
}
