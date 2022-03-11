class Main {
  public static void main(String[] args) {
    Car firstCar = new Car("ERS555", new Account("Roberto Rosas", "ROB456"));    
    firstCar.setPassengers(2);
    firstCar.printCarData();

    Car secondCar = new Car("POU999", new Account("Carlos Comue", "CAR989"));
    secondCar.setPassengers(1);
    secondCar.printCarData();

    // Clase 31 - 32
    CarBasic firsBasic = new CarBasic("RRR555", new Account("Jonas Jon", "JJ88"), "SuperMarca", "SuperModelo");    
    firsBasic.setPassengers(4);
    firsBasic.printCarData();
  }
}