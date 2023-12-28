package secondEvidence;

import java.util.Scanner;

public class LuxuryCar extends Car{
    private int seatWarmers=6;
    private int windows=5;

    @Override
    public String toString() {
        return "LuxuryCar{" +
                " brand='" + brand + '\'' +
                ", wheelsQuantity=" + wheelsQuantity + '\'' +
                ", brakesType='" + brakesType + '\'' +
                ", doors=" + doors + '\'' +
                ", color='" + color + '\'' +
                ", windows=" + windows + '\'' +
                ", seatWarmers=" + seatWarmers + '\'' +
                ", VIN=" + super.getVIN() + '\'' +
                ", Owner=" + super.getOwner() + '\'' +
                '}';
    }

    @Override
    public void setCarProperties(Scanner scan){
        super.setCarProperties(scan);
        System.out.println("Type how many seat warmers has the car");
        setSeatWarmers(Integer.parseInt(scan.nextLine()));
        System.out.println("¿How many windows has the car?");
        setWindows(Integer.parseInt(scan.nextLine()));
    }

    // Constructor, Getter & Setter methods
    public LuxuryCar() { }

    public LuxuryCar(String brand, int wheelsQuantity, int doors, String brakesType, String color, String VIN, String owner, int seatWarmers, int windows) {
        super(brand, wheelsQuantity, doors, brakesType, color, VIN, owner);
        this.seatWarmers = seatWarmers;
        this.windows = windows;
    }

    public int getSeatWarmers() {
        return seatWarmers;
    }

    public void setSeatWarmers(int seatWarmers) {
        this.seatWarmers = seatWarmers;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}