public class Car {
  Integer id;
  String license;
  Account driver;
  Integer passengers;

  // Metodo constructor
  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
  }

  void printCarData() {
    System.out.println("Driver: " + driver.name + " - " + "License: " + license);
  }
}
