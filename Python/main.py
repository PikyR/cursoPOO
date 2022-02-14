from car import Car

if __name__ == "__main__":
  firstCar = Car()
  firstCar.license = "REW000"
  firstCar.driver = "Ral Roberto"
  print(vars(firstCar))

  secondCar = Car()
  secondCar.license = "TER888"
  secondCar.driver = "Carlos Corol"
  print(vars(secondCar))