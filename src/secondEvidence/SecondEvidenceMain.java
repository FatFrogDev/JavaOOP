package secondEvidence;

import java.util.Scanner;
import  secondEvidence.*;

public class SecondEvidenceMain {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bike bike = new Bike();
        MountainBike mb = new MountainBike();
        Car car = new Car();
        LuxuryCar luxCar = new LuxuryCar();

        System.out.println("¡Welcome!, you will state characteristics of some vehicles");
        System.out.println("Lets start with bike");
        bike.setBikeProperties(scan);
        System.out.println( "The result of your bike is: " + bike.toString());
        scan.reset();
        System.out.println( System.lineSeparator());

        System.out.println("Lets set now a mountain bike");
        mb.setBikeProperties(scan);
        System.out.println("The result of your mountain bike is: " + mb.toString());
        scan.reset();
        System.out.println( System.lineSeparator() );

        System.out.println("Now we'll state a simple car properties");
        car.setCarProperties(scan);
        System.out.println("The result of your car is: " + car.toString());
        scan.reset();

        System.out.println("Now we'll state the luxury car properties");
        luxCar.setCarProperties(scan);
        System.out.println("The result of your car is: " + luxCar.toString());
        scan.reset();

    }
}