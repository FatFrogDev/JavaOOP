package collections.homework;

public class Product {
    private  int productId;
    private String name;
    private double price;
    private int stock;

    @Override
    public String toString() {
        return "Product: { " +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", value=" + price +
                ", stack=" + stock +
                " }";
    }

    public Product(int productId, String name, double value, int stack) {
        this.productId = productId;
        this.name = name;
        this.price = value;
        this.stock = stack;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if ( stock>0 ){
            this.stock = stock;
        } else System.out.println("Whoops, you can't set stack less than 0");

    }
}
