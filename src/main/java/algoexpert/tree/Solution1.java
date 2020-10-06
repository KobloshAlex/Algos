package algoexpert.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int carType = Integer.parseInt(bufferedReader.readLine().trim());
    int carMileage = Integer.parseInt(bufferedReader.readLine().trim());

    if (carType == 0) {
      Car wagonR = new WagonR(carMileage);
      wagonR.printCar("WagonR");
    }

    if (carType == 1) {
      Car hondaCity = new HondaCity(carMileage);
      hondaCity.printCar("HondaCity");
    }

    if (carType == 2) {
      Car innovaCrysta = new InnovaCrysta(carMileage);
      innovaCrysta.printCar("InnovaCrysta");
    }
  }
}

abstract class Car {

  protected Boolean isSedan;
  protected String seats;

  public Car(Boolean isSedan, String seats) {
    this.isSedan = isSedan;
    this.seats = seats;
  }

  public Boolean getIsSedan() {
    return this.isSedan;
  }

  public String getSeats() {
    return this.seats;
  }

  public abstract String getMileage();

  public void printCar(String carName) {
    boolean isSedan = this.getIsSedan();
    if (isSedan) {
      System.out.print("A " + carName + " is Sedan, is ");
    } else {
      System.out.print("A " + carName + " is not Sedan, is ");
    }
    System.out.print(this.getSeats() + "-seater, and " + this.getMileage() + "-mileage.");
  }
}

// Create a class named WagonR.
class WagonR extends Car {
  private final String mileage;

  public WagonR(Integer mileage) {
    super(false, "4");
    this.mileage = mileage + " kmpl";
  }

  // Create a method named getMileage().
  public String getMileage() {
    return this.mileage;
  }
}

// Create a class named HondaCity.

class HondaCity extends Car {
  private final String mileage;

  public HondaCity(Integer mileage) {
    super(true, "4");
    this.mileage = mileage + " kmpl";
  }

  public String getMileage() {
    return this.mileage;
  }
}

class InnovaCrysta extends Car {
  private final String mileage;

  public InnovaCrysta(Integer mileage) {
    super(false, "6");
    this.mileage = mileage + " kmpl";
  }

  public String getMileage() {
    return this.mileage;
  }
}
