// import java.util.ArrayList;
// import java.util.Map;

class UberVan extends CarAdvanced {  
  
  // public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
  //   super(license, driver, typeCarAccepted, seatsMaterial);
  // }

  public UberVan(String license, Account driver) {
    super(license, driver);
  }
    
  @Override  
  public void setPassengers(Integer passengers) {
    if (passengers == 6) {
      this.passengers = passengers;
    } else {
      System.out.println("Necesitas asignar 6 pasajeros");
    }
  }
}
