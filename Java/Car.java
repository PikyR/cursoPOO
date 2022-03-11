public class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passengers;

  // Metodo constructor
  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;    
  }

  void printCarData() {
    if (passengers != null) {
      System.out.println(
        "Driver: " + driver.name + " - " + 
        "License: " + license + " - " + 
        "Passengers: " + passengers
      );
    }
  }

  public Integer getPassengers(){
    return passengers;
  }

  public void setPassengers(Integer passengers){
    if (passengers == 4) {
      this.passengers = passengers;
    } else {
      System.out.println("Necesitas asignar 4 pasajeros.");
    }
  }
}
