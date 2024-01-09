package collections.exercise;

import java.util.*;

// Doing the exercise with List object
public class SuperMarket {

    private String name="My Supermarket";

    private List<Product> inventory = new ArrayList<>(10);

    public void start(Scanner scan){
        boolean continueIn=true;
        System.out.println("Welcome to " + name);
        while (continueIn) {
            scan = new Scanner(System.in); // <- Creates a new Scanner object, it's a try to "reset" the cache of itself.
            System.out.println("¿What do you want to do? \n 1. Add products \n 2. List selling prices \n 3. Sell products \n 4.Remove products \n 5. Show inventory");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1->{
                    addProduct(scan);
                }
                case 2->{
                    listSellingPrices();
                }
                case 3->{
                    sellProduct(scan);
                }
                case 4 ->{
                    clearProduct(scan);
                }
                case 5->{
                    showInventory();
                }
                default -> {
                    System.out.println("Whoops, wrong option, try again");
                    continue;
                }
            }
            System.out.println("¿Do you want to keep in the program or exit? (1.Yes, Other number->no)");
            continueIn = scan.nextInt() == 1;
        }

    }

    public void sellProduct(Scanner scan){
        boolean keepOn=false;
        do {
            System.out.println("To sell a product, type its id");
            int productId = scan.nextInt();
            scan.nextLine();
            if ( productExists(productId) ) {
                Product product = inventory.get(productId-1);
                System.out.println("There is: " + product.getStock());
                System.out.println("Type the quantity of the products you want to sell");
                int toSell = scan.nextInt();
                scan.nextLine();
                product.setStock( product.getStock() - toSell );
            } else{
                System.out.println("Wrong product id, try again");
                continue;
            }
            System.out.println("¿Do you want to sell another product? 1-> Yes, other number -> No");
            int option = scan.nextInt();
            scan.nextLine();
            keepOn = option == 1;  
        }while (keepOn);
    }

    public void listSellingPrices(){
        for(Product product:inventory){
            System.out.println(product.getName());
            System.out.println(product.getPrice());
        }
    }

    public void clearProduct(Scanner scan){
        boolean keepOn=false;
        do {
            int option=0;
            System.out.println("Type the id of the product to clear");
            int clearingProductId = scan.nextInt();
            scan.nextLine();
            if (productExists(clearingProductId)) {
                inventory.set(clearingProductId-1, null);
            } else System.out.println("Whoops, invalid product id, try again");

            System.out.println("¿Do you want to clear another product? (1-> Yes, other number->No)");
            option = scan.nextInt();
            scan.nextLine();
            keepOn = option == 1;
        }
        while (keepOn);
    }

    public void showInventory(){
        if (!inventory.isEmpty()){
            for (Product product:inventory){
                if (product!=null) {
                    System.out.print(product.toString() + "\n");
                } else System.out.println("There's no product here");
            }
        } else System.out.println("Oops, seems like there is no inventory, try adding some first");
    }

    public void addProduct(Scanner scan){
        boolean keepOn=true;
        do {
            Product product = new Product();
            int option = 0;
            System.out.println("To add a product, start typing it's name: (Only integer numbers)");
            int productId = scan.nextInt();
            if (validProduct(productId)) {
                product.setProductId(productId);
            } else {
                System.out.println("Seems like this id isn't valid, try with another");
                continue;
            }
            scan.nextLine();
            System.out.println("now, type its name");
            product.setName(scan.nextLine());
            System.out.println("type its value");
            product.setPrice(scan.nextDouble());
            scan.nextLine();
            System.out.println("Finally, type its stock");
            product.setStock(scan.nextInt());
            System.out.println("¿Do you want to ad other product? (1->Yes, other number->No)");

            option = scan.nextInt();
            scan.nextLine();
            keepOn = option == 1;

            inventory.add(product);
        } while (keepOn);
    }

    public boolean validProduct(int productId) {
        boolean exists = true;
        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                exists = false;
                break;
            }
        }
        return exists;
    }

    public boolean productExists(int productId){
        boolean exists = false;
        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                exists = true;
                break;
            }
        }
        return exists;
    }
}