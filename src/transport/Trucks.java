package transport;

public class Trucks extends Transport{
    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Trucks(String brand, String model, double engineVolume) {
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