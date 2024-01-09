package collections.homework;

import java.util.Scanner;

public class Restaurant {
    private String name="My restaurant";
    private String address;

    private Menu menu;

    public void start(){
        boolean keep=false;
        System.out.println("Welcome to " + name + "What do you want to do?");
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("1. add 5 recipes to the menu \n 2. Replace the third option for a vegan recipe \n 3. print the amount of recipes \n 4. Print the whole menu specifying name and price");
            int option = scan.nextInt();
            switch (option){
                case 1->{
                    menu.addFiveRecipes(scan);
                }
                case 2->{
                    menu.replaceThird(scan);
                }
                case 3->{
                    menu.printAmountOfRecipes();
                }
                case 4->{
                    menu.printWholeMenu();
                }
                default -> {
                    System.out.println("Wrong option");
                    continue;
                }
            }
            System.out.println("Do you want to continue? 1. yes 2.no");
            keep = scan.nextInt() == 1;
        }while (keep);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
