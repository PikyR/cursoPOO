<?php
  require_once('Car.php');
  require_once('Account.php');
  require_once('CarBasic.php');
  require_once('CarAdvanced.php');
  require_once('UberVan.php');

  $firsCar = new Car("WER444", new Account("Cesar Cama", "CES666"));
  $firsCar->setPassengers(4);
  $firsCar->printCarData();

  $uberX = new CarBasic("RFR789", new Account("Raul Rauna", "RAUL789"), "Chevroleta", "StaarLord");
  $uberX->printCarData();

  $uberPool = new CarBasic("LIC753", new Account("Juan Juanes", "JUAN788"), "Dodge", "Coso");
  // $uberPool->printCarData();

  $uberVan = new UberVan("LEC888", new Account("Cesar Cama", "CES000"), "Aceptado", "Material");
  $uberVan->setPassengers(6);
  $uberVan->printCarData();


?>