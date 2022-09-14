package week4;

public class Car {

    private long id = 0;
    private String mark;
    private int price;
    private int yearOfRelease;
    private String model;
    private String color;
    private double volume;
    private String transmissionType;

    public Car(String mark, int price, int yearOfRelease, String model, String color, double volume, String transmissionType) {
        id++;
        this.mark = mark;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.color = color;
        this.volume = volume;
        this.transmissionType = transmissionType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
