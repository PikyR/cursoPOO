<?php
  require_once('Account.php');
  class Car { 
    public $id;
    public $license;
    public $driver;
    public $passengers;

    public function __construct($license, $driver) {
      $this->license = $license;
      $this->driver = $driver;
    }

    public function printCarData(){
      echo "License: $this->license - Conductor: {$this->driver->name} - Document: {$this->driver->document} <br> \n";
    }
  }
?>