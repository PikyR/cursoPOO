<?php
  class CarAdvanced extends car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model) {
      parent::__construct($licence, $driver);
      $this->brand = $brand;
      $this->model = $model;
    }
  }
?>