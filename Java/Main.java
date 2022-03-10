class Main {
  public static void main(String[] args) {
    Car firstCar = new Car("ERS555", new Account("Roberto Rosas", "ROB456"));
    firstCar.passengers = 4;
    firstCar.printCarData();

    Car secondCar = new Car("POU999", new Account("Carlos Comue", "CAR989"));
    secondCar.passengers = 2;
    secondCar.printCarData();

    // Clase 31
    CarBasic firsBasic = new CarBasic("RRR555", new Account("Jonas Jon", "JJ88"), "SuperMarca", "SuperModelo");
    firsBasic.passengers = 99;
    firsBasic.printCarData();
  }
}