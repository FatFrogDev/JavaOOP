package secondEvidence;

import java.util.Scanner;

public class MountainBike extends Bike {

    public String suspensionType="Hydraulic";
    public short suspensionQuantity=2;
    public String brakesType="Hydraulic";

    @Override
    public String toString() {
        return  "MountainBike{" +
                "brand='" + brand + '\'' +
                ", wheelsQuantity=" + wheelsQuantity +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                ", owner='" + super.getOwner() + '\'' +
                "suspensionType='" + suspensionType + '\'' +
                ", suspensionQuantity=" + suspensionQuantity +
                ", brakesType='" + brakesType + '\'' +
                '}';
    }

    public void setBikeProperties(Scanner scan){
        super.setBikeProperties(scan);
        System.out.println("¿Which type of suspension does this bike have?");
        setSuspensionType(scan.nextLine());
        System.out.println("Type the suspensions quantity");
        setSuspensionQuantity(Short.parseShort(scan.nextLine()));
        System.out.println("Type the brakes type of this clas");
        setBrakesType(scan.nextLine());
    }

    // Constructor, Getter & Setter methods
    public MountainBike() {}

    public MountainBike(String brand, int wheelsQuantity, String color, boolean isElectric, String serialNumber, String owner, String suspensionType, short suspensionQuantity, String brakesType) {
        super(brand, wheelsQuantity, color, isElectric, serialNumber, owner);
        this.suspensionType = suspensionType;
        this.suspensionQuantity = suspensionQuantity;
        this.brakesType = brakesType;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public short getSuspensionQuantity() {
        return suspensionQuantity;
    }

    public void setSuspensionQuantity(short suspensionQuantity) {
        this.suspensionQuantity = suspensionQuantity;
    }

    public String getBrakesType() {
        return brakesType;
    }

    public void setBrakesType(String brakesType) {
        this.brakesType = brakesType;
    }

}
