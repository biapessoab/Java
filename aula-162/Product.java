public class Product {
    String name;
    Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    // Methods
    public String priceTag() {
        String priceTag = name + " " + Double.toString(price);
        return priceTag;
    }
}