class CarBasic extends Car{
  String brand;
  String model;

  public CarBasic(String license, Account driver, String brand, String model) {
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }

  @Override
  void printCarData() {    
    super.printCarData();
    System.out.println(
      "Marca: " + brand + " - " +
      "Modelo: " + model
    );
  }
}
