package seventhExercise;

import java.util.Scanner;

public class Product {
    private int id;
    public String name;
    public float prize;

    private int stock;

    public void setProductAttributes(Scanner scan){
        scan.nextLine();
        System.out.println("Set the name of the product: ");
        this.name = scan.nextLine();
        System.out.println("Now set the prize: ");
        this.prize = scan.nextFloat();
        System.out.println("Now set the stock: ");
        scan.nextLine();
        this.stock = scan.nextInt();
        System.out.println("Product saved!");
    }

    public void sellProduct(Product product){
        if ( product.getStock()>=1 ){
            product.stock-=1;
        }else{
            System.out.println("There is no more stock of this product!");
        }
    }

    public Product(int id, String name, float prize, int stock) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.stock = stock;
    }

    public void clearProductAttributes(){
        this.name="";
        this.prize=0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prize=" + prize +
                ", stock=" + stock +
                '}';
    }

    public Product() {
    }

    public Product(int id) {
        this.id=id;
    }

    public Product(int id, String name, float prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {

        if (stock>=0){
            this.stock = stock;
        }else{
            System.out.println("You can't set a negative stock, try using zero or grater values");
        }
    }
}
