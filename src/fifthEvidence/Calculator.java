package fifthEvidence;

import java.util.Scanner;

public class Calculator {

    Scanner scan = new Scanner(System.in);

    public void operate(){
        int keepOnCalc=0;
        operation : while (true){
            scan.reset();
            System.out.println("Welcome to the calculator, type the operation you want to execute: \n 1.Sum \n 2.Subtract \n 3.Multiply \n 4.Divide");
            int option = scan.nextInt();
            switch (option){
                case 1->{
                    double[] numbers = getNumbers("sum");
                    System.out.println("The result of the sum is:");
                    System.out.println(sum(numbers[0],numbers[1]));
                }
                case 2->{
                    double[] numbers = getNumbers("Subtract");
                    System.out.println("The result of the subtract is:");
                    System.out.println(subtract(numbers[0],numbers[1]));
                }
                case 3->{
                    double[] numbers = getNumbers("multiply");
                    System.out.println("The result of the multiplication is:");
                    System.out.println(multiply(numbers[0],numbers[1]));

                }
                case 4->{
                    double[] numbers = getNumbers("divide");
                    System.out.println("The result of the division is:");
                    System.out.println(divide(numbers[0],numbers[1]));
                }
                default -> {
                    System.out.println("Choose an option between 1 and 4");
                    continue;
                }
            }
            System.out.println("Type '1' if you want to do another operation, else type any other number");
            keepOnCalc = scan.nextInt();
            if ( keepOnCalc != 1){
                break operation;
            }
        }
    };


    private double[] getNumbers(String operation){
        System.out.println("You selected " + operation +", type a number");
        double num1=scan.nextDouble();
        System.out.println("Type other number");
        double num2=scan.nextDouble();
        return new double[] { num1, num2 };
    };

    private double sum (double num1, double num2){
        return  num1+num2;
    };

    private double subtract (double num1, double num2){
        return num1-num2;
    };

    private double multiply (double num1, double num2){
        return num1*num2;
    };

    private double divide(double num1, double num2){
        if (num2!=0){
            return  num1/num2;
        }else{
            throw new RuntimeException("You can't divide by zero.");
        }
    };

    public Calculator() { }
}
