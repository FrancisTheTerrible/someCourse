package Section_6.Carpet_Cost_Calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost >= 0.0D) {
            this.cost = cost;
        } else {
            this.cost = 0.0D;
        }

    }

    public double getCost() {
        return this.cost;
    }
}
