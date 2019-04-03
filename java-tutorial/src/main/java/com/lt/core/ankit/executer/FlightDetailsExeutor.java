package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.FlightDetails;

public class FlightDetailsExeutor {
    public static void main(String... arg){
        FlightDetails spiceJet = new FlightDetails();
        spiceJet.setFlightName("Spice Jet");
        spiceJet.setHolidaysPlane(4000);
        spiceJet.setCheckinTime(8.35);
        spiceJet.setDepartDate(03 - 04 - 2019);
        spiceJet.setDepartureCity("Mumbai");
        spiceJet.setArrivalCity("Delhi");
        spiceJet.setFlightNo(55574);

        FlightDetails[] flightDetails = new FlightDetails[3];
        flightDetails[0] = spiceJet;

        FlightDetails indigo = new FlightDetails();
        indigo.setFlightName("Indi Go");
        indigo.setHolidaysPlane(16000);
        indigo.setCheckinTime(8.35);
        indigo.setDepartDate(03 - 04 - 2019);
        indigo.setDepartureCity("Delhi");
        indigo.setArrivalCity("Newyork");
        indigo.setFlightNo(55574);

        flightDetails[1]= indigo;

        FlightDetails goAir = new FlightDetails();
        goAir.setFlightName("Go Air");
        goAir.setHolidaysPlane(16000);
        goAir.setCheckinTime(8.35);
        goAir.setDepartDate(03 - 04 - 2019);
        goAir.setDepartureCity("Delhi");
        goAir.setArrivalCity("Newyork");
        goAir.setFlightNo(55574);

        flightDetails[2] = goAir;

        for (int i = 0; i <= flightDetails.length-1; i = i + 1){
            System.out.println(flightDetails[i].getFlightName()+","+ flightDetails[i].getHolidaysPlane()+ ","+ flightDetails[i].getCheckinTime());
            System.out.println(flightDetails[i].getDepartDate()+","+ flightDetails[i].getDepartureCity()+"," + flightDetails[i].getArrivalCity());
            System.out.println(flightDetails[i].getFlightNo());
        }

    }
}
