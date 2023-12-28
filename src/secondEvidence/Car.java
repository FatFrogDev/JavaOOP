package secondEvidence;

import java.util.Scanner;

public class Car {
    public String brand;
    public int wheelsQuantity;
    public int doors;
    public String brakesType;
    public String color;

    private String VIN;
    // Suppose that it is always an owner for the exercise
    private String owner;

    public void setCarProperties(Scanner scan){
        System.out.println("Type the brand of the car");
        setBrand(scan.nextLine());
        System.out.println("Type the quantity of wheels that the car has");
        setWheelsQuantity(Integer.parseInt(scan.nextLine()));
        System.out.println("Type the quantity of doors of the car");
        setDoors(Integer.parseInt(scan.nextLine()));
        System.out.println("¿Which type of brakes does the car has?");
        setBrakesType(scan.nextLine());
        System.out.println("Type the color of the car");
        setColor(scan.nextLine());
        System.out.println("Type the vehicle identification number");
        setVIN(scan.nextLine());
        System.out.println("¿Who is the owner of this vehicle?");
        setOwner(scan.nextLine());
    }


    // Constructor, Getter & Setter methods

    @Override
    public String toString() {
        return  "Car{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheelsQuantity +
                ", brakes=" + brakesType +
                ", color='" + color + '\'' +
                ", VIN='" + VIN + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Car() { }

    public Car(String brand, int wheelsQuantity, int doors, String brakesType, String color, String VIN, String owner) {
        this.brand = brand;
        this.wheelsQuantity = wheelsQuantity;
        this.doors = doors;
        this.brakesType = brakesType;
        this.color = color;
        this.VIN = VIN;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public void setWheelsQuantity(int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getBrakesType() {
        return brakesType;
    }

    public void setBrakesType(String brakesType) {
        this.brakesType = brakesType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
