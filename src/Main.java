import transport.Bus;
import transport.Passenger;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {
        Passenger ps1 = new Passenger("Lada", "Vesta", 1.7);
        Passenger ps2 = new Passenger("Audi", "A8", 3.0);
        Passenger ps3 = new Passenger("Mazda", "RX8", 2.5);
        Passenger ps4 = new Passenger("VW", "Polo Sedan", 1.6);

        Trucks tr1 = new Trucks("Volvo", "FH12", 13.0);
        Trucks tr2 = new Trucks("Scania", "FH12", 14.5);
        Trucks tr3 = new Trucks("KAMAZ", "FH12", 15.0);
        Trucks tr4 = new Trucks("MercedesBenz", "Actos", 16.5);

        Bus MAZ1 = new Bus("MAZ", "203", 10.0);
        Bus MAZ2= new Bus("MAZ", "205", 11.5);
        Bus MAZ3 = new Bus("MAZ", "206", 12);
        Bus MAZ4 = new Bus("MAZ", "207", 12.5);
    }
}
