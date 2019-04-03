package main.java.com.lt.core.ankit.pojo;

/**
 * Created by Lhotse Team on 4/3/2019.
 */
public class HospitalDetails {
    private String name;
    private int contectInfo;
    private String branches;
    private String hardSarjanName;
    private String address;
    private int ambulanceNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContectInfo() {
        return contectInfo;
    }

    public void setContectInfo(int contectInfo) {
        this.contectInfo = contectInfo;
    }

    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public String getHardSarjanName() {
        return hardSarjanName;
    }

    public void setHardSarjanName(String hardSarjanName) {
        this.hardSarjanName = hardSarjanName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmbulanceNo() {
        return ambulanceNo;
    }

    public void setAmbulanceNo(int ambulanceNo) {
        this.ambulanceNo = ambulanceNo;
    }
}
