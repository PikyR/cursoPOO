<?php
  require_once('Car.php');
  require_once('Account.php');

  $firsCar = new Car("WER444", new Account ("Cesar Cama", "CES000"));
  $firsCar->printCarData();
?>