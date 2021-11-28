package web.model;

public class Car {
    private String model;
    private String color;
    private int engineVolume;

    public Car() {
    }

    public Car(String model, String color, int engineVolume) {
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
}
