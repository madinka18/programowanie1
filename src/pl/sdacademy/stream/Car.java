package pl.sdacademy.stream;

public class Car {
    private String markAndmodel;
    private String colour;
    private int maxSpeed;

    public Car(String markAndmodel, String colour, int maxSpeed) {
        this.markAndmodel = markAndmodel;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public String getmarkAndmodel() {
        return markAndmodel;
    }

    public void setmarkAndmodel(String markAndmodel) {

        this.markAndmodel = markAndmodel;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Samochód " + "Marka i model: " + markAndmodel  + " kolor : " + colour + "\n";
    }
}