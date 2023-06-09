import java.util.Date;

public class UsedProduct extends Product {
    String manufactureDate;

    public UsedProduct() {
        super();
    }
    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Methods
    @Override
    public String priceTag() {
        return name + " (used) $" + price + " (Manufacture date: " + manufactureDate + ")";
    }
}
