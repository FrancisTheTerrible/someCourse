package Section_6;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        if (height > 0.0D) {
            this.height = height;
        } else {
            this.height = 0.0D;
        }

        if (width > 0.0D) {
            this.width = width;
        } else {
            this.width = 0.0D;
        }

    }

    public Wall() {
        this.width = 0.0D;
        this.height = 0.0D;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        if (height > 0.0D) {
            this.height = height;
        } else {
            this.height = 0.0D;
        }

    }

    public void setWidth(double width) {
        if (width > 0.0D) {
            this.width = width;
        } else {
            this.width = 0.0D;
        }

    }

    public double getArea() {
        double area = this.getHeight() * this.getWidth();
        return area;
    }
}
