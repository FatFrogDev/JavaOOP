package seventhExercise;

import java.util.Scanner;

public class Supermarket {
        Scanner scan = new Scanner(System.in);
        Product product1 = new Product(1);
        Product product2 = new Product(2);
        Product product3 = new Product(3);
        Product product4 = new Product(4);
        Product product5 = new Product(5);


    public void start(){
        System.out.println("¡Hi!, welcome to your supermarket");
        loop : while (true){
            scan.reset();
            System.out.println("¿What do you want to do? \n 1. Set a product (max 5) \n 2. Clear a product \n  3.See all products \n 4. Sell a product \n 5. Exit");
            int option = scan.nextInt();
            switch (option){
                case 1 ->{
                    System.out.println("Enter the product id (between 1 and 5)");
                    int productId = scan.nextInt();
                        if (productId> 0 && productId<6) {
                            switch (productId){
                                case 1->{
                                    product1.setProductAttributes(scan);
                                }
                                case 2->{
                                    product2.setProductAttributes(scan);
                                }
                                case 3->{
                                    product3.setProductAttributes(scan);
                                }
                                case 4->{
                                    product4.setProductAttributes(scan);
                                }
                                case 5->{
                                    product5.setProductAttributes(scan);
                                }
                            }
                        }else System.out.println("Type a value between 1 and 5");
                }
                case 2->{
                    System.out.println("Type the id of the product (1-5)");
                    int productId = scan.nextInt();
                    if (productId> 0 && productId<6) {
                        switch (productId){
                            case 1->{
                                product1.clearProductAttributes();
                            }
                            case 2->{
                                product2.clearProductAttributes();
                            }
                            case 3->{
                                product3.clearProductAttributes();
                            }
                            case 4->{
                                product4.clearProductAttributes();
                            }
                            case 5->{
                                product5.clearProductAttributes();
                            }
                        }
                    }else System.out.println("Type a value between 1 and 5");
                }
                case 3->{
                    showProducts();
                }
                case 4->{
                    System.out.println("Type the id of the product (1-5)");
                    int productId = scan.nextInt();
                    if (productId> 0 && productId<6) {
                        switch (productId){
                            case 1->{
                                product1.sellProduct(product1);
                            }
                            case 2->{
                                product2.sellProduct(product2);
                            }
                            case 3->{
                                product3.sellProduct(product3);
                            }
                            case 4->{
                                product4.sellProduct(product4);
                            }
                            case 5->{
                                product5.sellProduct(product5);
                            }
                        }
                    }else System.out.println("Type a value between 1 and 5");
                }
                case 5->{
                    break loop;
                }
                default -> {
                    System.out.println("Select a valid option");
                }
            }
        }
    }

    public void addProduct(int id, Scanner scan){
            System.out.println("Type the id of the product");
            int productId = scan.nextInt();
            switch (productId){
                case 1->{
                    if (product1.getName()!="") {
                        product1.setProductAttributes(scan);
                    }else{
                        System.out.println("Try with another empty product or clear a product.");
                    }
                }
                case 2->{
                    if (product2.getName()!="") {
                        product2.setProductAttributes(scan);
                    }else{
                        System.out.println("Try with another empty product or clear a product.");
                    }
                }
                case 3->{
                    if (product3.getName()!="") {
                        product3.setProductAttributes(scan);
                    }else{
                        System.out.println("Try with another empty product or clear a product.");
                    }
                }
                case 4->{
                    if (product4.getName()!="") {
                        product4.setProductAttributes(scan);
                    }else{
                        System.out.println("Try with another empty product or clear a product.");
                    }
                }
                case 5->{
                    if (product5.getName()!="") {
                        product5.setProductAttributes(scan);
                    }else{
                        System.out.println("Try with another empty product or clear a product.");
                    }
                }
                default -> {
                    System.out.println("Type a value between 1 and 5");
                }
            }
        }

    public void clearProduct(int id, Scanner scan){
            System.out.println("Type the id of the product to clear");
            int cleringProductId = scan.nextInt();
            switch (cleringProductId){
                case 1->{
                        product1.clearProductAttributes();
                }
                case 2->{
                        product2.clearProductAttributes();
                }
                case 3->{
                        product3.clearProductAttributes();
                }
                case 4->{
                        product4.clearProductAttributes();
                }
                case 5->{
                        product5.clearProductAttributes();
                }
                default -> {
                    System.out.println("Type a value between 1 and 5");
                }
            }
        }

    public void showProducts(){
            System.out.println("¡Hey!, here's all the products that you have: ");
            if (product1.getName()!=""){
                System.out.println(product1.toString());
            }
            if (product2.getName()!=""){
                System.out.println(product2.toString());
            }
            if (product3.getName()!=""){
                System.out.println(product3.toString());
            }
            if (product4.getName()!=""){
                System.out.println(product4.toString());
            }
            if (product5.getName()!=""){
                System.out.println(product5.toString());
            }
        }
}
