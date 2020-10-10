package Section_6.Carpet_Cost_Calculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width >= 0.0D) {
            this.width = width;
        } else {
            this.width = 0.0D;
        }

        if (length >= 0.0D) {
            this.length = length;
        } else {
            this.length = 0.0D;
        }

    }

    public double getArea() {
        double area = this.width * this.length;
        return area;
    }
}
