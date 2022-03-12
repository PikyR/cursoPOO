class Main {
  public static void main(String[] args) {
    Car firstCar = new Car("ERS555", new Account("Roberto Rosas", "ROB456"));    
    firstCar.setPassengers(2);
    firstCar.printCarData();

    // Clase 31 - 32
    CarBasic firsBasic = new CarBasic("RRR555", new Account("Jonas Jon", "JJ88"), "SuperMarca", "SuperModelo");    
    firsBasic.setPassengers(4);
    firsBasic.printCarData();

    // Clase 33
    UberX firstUberX = new UberX("LIC123", new Account("Juan", "j654"), "MetaBrand", "MetaModel");
    firstUberX.setPassengers(4);
    firstUberX.printCarData();
    
    UberVan firstUberVan = new UberVan("QWE888", new Account("Jonas Jon", "JJ88"));
    firstUberVan.setPassengers(6);
    System.out.println("Van");
    firstUberVan.printCarData();
  }
}