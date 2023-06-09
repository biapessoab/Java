package aula165;

public class PJ extends Pessoa{
    private int employees;
    private double tax;

    public PJ() {
        super();
    }
    public PJ(String name, double income, int employees) {
        super(name, income);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    // Methods
    @Override
    public double tax() {
        if (employees > 10) {
            tax = income * 0.14;
        }
        else {
            tax = income * 0.16;
        }
        return tax;
    }
}
