<?php
  require_once('CarBasic.php');
  class UberX extends CarBasic {
    public function __construct($license, $driver, $brand, $model){
      parent::__construct($license, $driver, $brand, $model);
    }
  }
?>