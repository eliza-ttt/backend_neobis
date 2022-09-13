package week3;

public class Cake {

    private long id = 0;
    private String title;
    private String weight;
    private int price;
    private String brand;
    private String color;

    public Cake(String title, String weight, int price, String brand, String color) {
        id++;
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
