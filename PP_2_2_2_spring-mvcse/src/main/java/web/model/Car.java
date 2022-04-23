package web.model;
public class Car {
    private String Model;
    private int series;
    private String color;

    public Car(String model, int series, String color) {
        Model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


