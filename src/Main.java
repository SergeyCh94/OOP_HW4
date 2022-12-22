import transport.*;

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

        DriverB<Passenger> ivanov_ivan = new DriverB<>("Ivanov Ivan");
        ivanov_ivan.start(ps1);
        DriverC<Trucks> semenov_semen = new DriverC<>("Semenov Semen");
        semenov_semen.start(tr1);
        DriverD<Bus> sergeev_sergey = new DriverD<>("Sergeev Sergey");
        sergeev_sergey.start(MAZ1);

    }
}
