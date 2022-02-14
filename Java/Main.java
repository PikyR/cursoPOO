class Main {
  public static void main(String[] args) {
    Car firstCar = new Car();
    firstCar.driver = "Roberto Rosas";
    firstCar.license = "ERS555";
    firstCar.printCarData();

    Car secondCar = new Car();
    secondCar.driver = "Carlos Comue";
    secondCar.license = "POU999";
    secondCar.printCarData();
  }
}