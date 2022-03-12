<?php 
  require_once('CarAdvanced.php'); 
  class UberVan extends CarAdvanced {
    public function __construct($license, $driver, $typeCarAccepted, $SeatsMaterial) {
      parent::__construct($license, $driver, $typeCarAccepted, $SeatsMaterial);
    }

    public function setPassengers($passengers){
      if ($passengers == 6) {
        $this->passengers = $passengers;        
      } else {
        echo "Necesitas asignar 6 pasajeros";
      }
    }

    public function printCarData(){
      echo "
        License: $this->license 
        Conductor: {$this->driver->name}  
        Pasajeross: $this->passengers 
      ";
    }
  }
?>