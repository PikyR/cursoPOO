class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passengers;
  }

  printCarData = function () {
    console.log(this.driver.name);
    console.log(this.driver.document);
    console.log(this.license); 
  }
  
  // printCarData = () => {
  //   console.log(this.driver.name);
  //   console.log(this.driver.document);
  //   console.log(this.license);    
  // }
}