import java.util.ArrayList;
import java.util.Map;

class CarAdvanced extends Car{
  Map<String, Map<String,Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;
  
  // public CarAdvanced(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
  //   super(license, driver);
  //   this.typeCarAccepted = typeCarAccepted;
  //   this.seatsMaterial = seatsMaterial;
  // }

  //Constructor de ejemplo para la clase 33
  public CarAdvanced(String license, Account driver) {
    super(license, driver);  
  }
}
