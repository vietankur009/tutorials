package main.java.com.lt.core.constructors;


public class PersnoalDetails {
    private String name;
    private String address;
    private int addharNumber;

    public PersnoalDetails(){

    }
    public PersnoalDetails(String name, String address, int addharNumber){
        this.name = name;
        this.address = address;
        this.addharNumber = addharNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAddharNumber() {
        return addharNumber;
    }
}
