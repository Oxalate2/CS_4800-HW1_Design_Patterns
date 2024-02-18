public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new CruiseShip("Ship1", "2000", 1000);
        ships[1] = new CruiseShip("CruiseShip1", "2010", 500);
        ships[2] = new CargoShip("CargoShip1", "2020", 10000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}