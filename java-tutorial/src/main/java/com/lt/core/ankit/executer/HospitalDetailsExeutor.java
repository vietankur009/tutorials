package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.HospitalDetails;

/**
 * Created by Lhotse Team on 4/3/2019.
 */
public class HospitalDetailsExeutor {
    public static void main(String... arg){
        HospitalDetails jaypee = new HospitalDetails();
        jaypee.setName("Jeepayee Hospital");
        jaypee.setContectInfo(01204122222);
        jaypee.setAddress("Jaypee Hospital Rd, Goberdhanpur, Sector 128, Noida, Uttar Pradesh 201304");
        jaypee.setAmbulanceNo(108);
        jaypee.setHardSarjanName("Mr. Anirudh Pratap Singh");
        jaypee.setBranches("Noida");

        HospitalDetails[] hospitalDetails = new HospitalDetails[3];
        hospitalDetails[0] = jaypee;

        HospitalDetails apollo = new HospitalDetails();
        apollo.setName("Apollo Hospital");
        apollo.setContectInfo(1860500491);
        apollo.setAddress("E2, Block E, Sector 26, Noida, Uttar Pradesh 201301");
        apollo.setAmbulanceNo(108);
        apollo.setHardSarjanName("Mr. Anirudh Pratap Singh");
        apollo.setBranches("Noida");

        hospitalDetails[1]= apollo;

        HospitalDetails metro = new HospitalDetails();
        metro.setName("Metro Hospital And Heart Institute");
        metro.setContectInfo(01204366666);
        metro.setAddress(" Block X, 1, Vyapar Marg, Buddh Vihar, Block X, Sector 12, Noida, Uttar Pradesh 201301");
        metro.setAmbulanceNo(108);
        metro.setHardSarjanName("Mr. Anirudh Pratap Singh");
        metro.setBranches("Noida");

        hospitalDetails[2] = metro;

        for(int i = 0; i <= hospitalDetails.length-1; i = i + 1){
            System.out.println(hospitalDetails[i].getName()+ ","+ hospitalDetails[i].getContectInfo()+","+ hospitalDetails[i].getAddress());
            System.out.println(hospitalDetails[i].getAmbulanceNo()+ "," + hospitalDetails[i].getHardSarjanName()+ "," + hospitalDetails[i].getBranches());
        }

    }
}
