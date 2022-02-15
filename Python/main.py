from car import Car
from account import Account

if __name__ == "__main__":
  firstCar = Car("POL555", Account("Juan Carlo", "JUA888"))
  print(vars(firstCar))
  print(vars(firstCar.driver))