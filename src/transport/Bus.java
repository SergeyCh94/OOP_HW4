package transport;

public class Bus extends Transport{
    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
}