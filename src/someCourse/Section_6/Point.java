package Section_6;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((double)(this.getX() * this.getX() + this.getY() * this.getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt((double)((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY())));
    }

    public double distance(Point point) {
        return this.distance(point.x, point.y);
    }
}
