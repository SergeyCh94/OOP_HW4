package transport;

public class Passenger extends Transport{
    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Passenger(String brand, String model, double engineVolume) {
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
