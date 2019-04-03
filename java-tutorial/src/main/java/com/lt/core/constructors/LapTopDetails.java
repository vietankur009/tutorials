package main.java.com.lt.core.constructors;


public class LapTopDetails {
    private String brand;
    private String type;
    private int price;

    public LapTopDetails(){

    }

    public LapTopDetails(String brand, String type, int price){
        this.brand = brand;
        this.type = type;
        this.price = price;

    }
    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
