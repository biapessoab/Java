public class ImportedProduct extends Product {
    Double customsFee;

    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // Methods
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        String priceTag = name + " " + Double.toString(totalPrice()) + " (Customs fee: $" + customsFee + ")";
        return priceTag;
    }
}
