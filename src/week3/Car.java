package week3;

public class Car {

    private long id = 0;
    private String mark;
    private String weight;
    private int price;
    private int yearOfRelease;
    private String model;
    private String color;
    private String mileage;
    private double volume;
    private int enginePower;
    private String transmissionType;
    private String condition;

    public Car(String mark, String weight, int price, int yearOfRelease, String model, String color, String mileage, double volume, int enginePower, String transmissionType, String condition) {
        id++;
        this.mark = mark;
        this.weight = weight;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.volume = volume;
        this.enginePower = enginePower;
        this.transmissionType = transmissionType;
        this.condition = condition;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
