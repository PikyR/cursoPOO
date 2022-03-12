<?php
  require_once('Car.php');
  class CarBasic extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model) {
      parent::__construct($license, $driver);
      $this->brand = $brand;
      $this->model = $model;
    }

    public function printCarData(){
      echo "
        Licencia: $this->license 
        Conductor: {$this->driver->name} 
        Documento: {$this->driver->document}
        Marca: $this->brand
        Modelo: $this->model
        Pasajeros: $this->passengers       
      ";
    }
  }
?>