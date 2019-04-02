package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.Schools;

public class SchoolExeutor {
    public static void main(String... arg){
        Schools priyanka = new Schools();
        priyanka.setName("Priyanka Modal Scnior secondory School");
        priyanka.setAddress("Near Dhampur Suger Mill Distt. Bijnor Uttar Pradesh");
        priyanka.setBord("C.B.S.C Afferated Delhi");
        priyanka.setQuainty(2500);
        priyanka.setPhysicsStudentQty(1500);
        priyanka.setClassStudents(150);
        priyanka.setPrincipalName("Mr. Virendra Chauhan");
        priyanka.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        priyanka.setSchoolOnerName("Mr. Ashok Kumar Rana");
        priyanka.setTeachersQty(53);
        System.out.println(priyanka.getName() + ", " + priyanka.getAddress() + " , " + priyanka.getBord() + ", "+ priyanka.getQuainty()+ ", " + priyanka.getPhysicsStudentQty() + "," + priyanka.getClassStudents()+ ", " + priyanka.getPrincipalName()+ ", " + priyanka.getPrincipalAddress()+ " ," + priyanka.getSchoolOnerName()+ ", " + priyanka.getTeachersQty());
    }
}
