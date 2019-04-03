package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.TrainDetails;

public class TrainDetailsExeutor {
    public static void main(String... arg){
        TrainDetails rajdhani = new TrainDetails();
        rajdhani.setTrainName("Rajdhani Express");
        rajdhani.setRoat("Delhi To Mumbai");
        rajdhani.setTrainNo(12437);
        rajdhani.setFirstStation("old Delhi");
        rajdhani.setFirstCochName("Sleeper Three Tyer");
        rajdhani.setPassengerDetails(2000);
        rajdhani.setFirstCochPassengerDetails(450);
        rajdhani.setAllCochQuainty(18);

        TrainDetails[] trainDetails = new TrainDetails[3];
        trainDetails[0] = rajdhani;

        TrainDetails chennaiExpress = new TrainDetails();
        chennaiExpress.setTrainName("Chennai Express");
        chennaiExpress.setRoat("Delhi To Chennai");
        chennaiExpress.setTrainNo(12434);
        chennaiExpress.setFirstStation("old Delhi");
        chennaiExpress.setFirstCochName("Sleeper Three Tyer");
        chennaiExpress.setPassengerDetails(2000);
        chennaiExpress.setFirstCochPassengerDetails(450);
        chennaiExpress.setAllCochQuainty(18);

        trainDetails[1] = chennaiExpress;

        TrainDetails arunachalExpress = new TrainDetails();
        arunachalExpress.setTrainName("Arunachal Express");
        arunachalExpress.setRoat("Naharlagun To Delhi");
        arunachalExpress.setTrainNo(12438);
        arunachalExpress.setFirstStation("Naharlagun");
        arunachalExpress.setFirstCochName("Sleeper Three Tyer");
        arunachalExpress.setPassengerDetails(2000);
        arunachalExpress.setFirstCochPassengerDetails(450);
        arunachalExpress.setAllCochQuainty(18);

        trainDetails[2] = arunachalExpress;

        for(int i = 0 ; i <= trainDetails.length-1; i = i + 1){
            System.out.println(trainDetails[i].getTrainName()+ ","+ trainDetails[i].getRoat()+","+ trainDetails[i].getTrainNo()+","+ trainDetails[i].getFirstStation()+","+ trainDetails[i].getFirstCochName());
            System.out.println(trainDetails[i].getPassengerDetails()+","+ trainDetails[i].getFirstCochPassengerDetails()+","+ trainDetails[i].getAllCochQuainty());
        }

    }
}
