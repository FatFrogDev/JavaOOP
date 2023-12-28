package secondEvidence;

import java.util.Scanner;

public class Bike {

    public String brand;
    public int wheelsQuantity;
    public String color;
    public boolean isElectric;

    private String serialNumber;
    // Suppose that it is always an owner for the exercise
    private String owner;
    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", wheelsQuantity=" + wheelsQuantity +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                ", serialNumber='" + serialNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public void setBikeProperties(Scanner scan){
        System.out.println("Type its Brand");
        setBrand(scan.nextLine());
        System.out.println("now its wheels quantity (type a number)");
        setWheelsQuantity( Integer.parseInt(scan.nextLine()) );
        System.out.println("now its color");
        setColor(scan.nextLine());
        System.out.println("¿Does it is electric? (type 1 if it is, else, type 2)");
        setElectric( Integer.parseInt(scan.nextLine() ) == 1 );
        System.out.println("Now type its serial number");
        setSerialNumber(scan.nextLine());
        System.out.println("Type the name of the owner");
        setOwner(scan.nextLine());
    }

    // Constructor, Getter & Setter methods

    public Bike() {}

    public Bike(String brand, int wheelsQuantity, String color, boolean isElectric, String serialNumber, String owner) {
        this.brand = brand;
        this.wheelsQuantity = wheelsQuantity;
        this.color = color;
        this.isElectric = isElectric;
        this.serialNumber = serialNumber;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
