package Section_6;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public Car() {
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (!validModel.equals("carrera") && !validModel.equals("commodore")) {
            this.model = "Unknown";
        } else {
            this.model = model;
        }

    }

    public String getModel() {
        return this.model;
    }
}
