<?php
  require_once('Car.php');
  require_once('Account.php');
  require_once('CarBasic.php');
  require_once('CarAdvanced.php');

  $firsCar = new Car("WER444", new Account("Cesar Cama", "CES000"));
  $firsCar->printCarData();

  $uberX = new CarBasic("RFR789", new Account("Raul Rauna", "RAUL789"), "Chevroleta", "StaarLord");
  $uberX->printCarData();

  $uberPool = new CarBasic("LIC753", new Account("Juan Juanes", "JUAN788"), "Dodge", "Coso");
  $uberPool->printCarData();
?>