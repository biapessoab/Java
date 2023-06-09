package aula165;

public class PF extends Pessoa {
    private double health;
    private double tax;

    public PF(){
        super();
    }
    public PF(String name, double income, double health) {
        super(name, income);
        this.health = health;
    }

    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }

    // Methods
    @Override
    public double tax() {
        if (getIncome() < 20000) {
            tax = getIncome() * 0.15;
        }
        else {
            tax = getIncome() * 0.25;
            if (health > 0) {
                tax = tax - (health / 2);
            }
        }
        return tax;
    }
}
