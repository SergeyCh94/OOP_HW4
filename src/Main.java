import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

public class Main {
    public static void main(String[] args) {
        Car ps1 = new Car("Lada", "Vesta", 1.7);
        Car ps2 = new Car("Audi", "A8", 3.0);
        Car ps3 = new Car("Mazda", "RX8", 2.5);
        Car ps4 = new Car("VW", "Polo Sedan", 1.6);

        Trucks tr1 = new Trucks("Volvo", "FH12", 13.0);
        Trucks tr2 = new Trucks("Scania", "FH12", 14.5);
        Trucks tr3 = new Trucks("KAMAZ", "FH12", 15.0);
        Trucks tr4 = new Trucks("MercedesBenz", "Actos", 16.5);

        Bus MAZ1 = new Bus("MAZ", "203", 10.0);
        Bus MAZ2= new Bus("MAZ", "205", 11.5);
        Bus MAZ3 = new Bus("MAZ", "206", 12);
        Bus MAZ4 = new Bus("MAZ", "207", 12.5);

        DriverB ivan = new DriverB("Ivan");
        DriverC sergey = new DriverC("Sergey");
        DriverD semen = new DriverD("Semen");

        ps1.start(ivan);
        tr1.start(sergey);
        MAZ1.start(semen);
    }
}
