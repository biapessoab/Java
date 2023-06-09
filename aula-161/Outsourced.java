public class Outsourced extends Employee {

    private double additional;

    public Outsourced() {
        super();
    }

    public Outsourced(String name, int hours, double valuePerHour, double additional) {
        super(name, hours, valuePerHour);
        this.additional = additional;
    }

    // Getters and setters
    
    public double getAdditional() {
        return additional;
    }
    public void setAdditional(double additional) {
        this.additional = additional;
    }

    // Methods

    @Override
    public double payment() {
        return super.payment() + (additional * 1.1);
    }
}
