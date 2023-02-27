package transport;

import driver.DriverD;

public class Bus extends Transport  <DriverD>{
    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }
}
