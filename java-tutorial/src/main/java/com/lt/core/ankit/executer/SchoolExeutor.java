package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.Schools;

public class SchoolExeutor {
    public static void main(String... arg){
        Schools priyanka = new Schools();

        priyanka.setName("Priyanka Modal Scnior secondory School");
        priyanka.setAddress("Near Dhampur Suger Mill (DSM) Distt. Bijnor Uttar Pradesh");
        priyanka.setBord("C.B.S.C Afferated Delhi");
        priyanka.setQuainty(2500);
        priyanka.setPhysicsStudentQty(1500);
        priyanka.setClassStudents(150);
        priyanka.setPrincipalName("Mr. Virendra Chauhan");
        priyanka.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        priyanka.setSchoolOnerName("Mr. Ashok Kumar Rana");
        priyanka.setTeachersQty(53);

        Schools[] schoolList = new Schools[5];
        schoolList[0]=priyanka;

        Schools radha = new Schools();
        radha.setName("radha inter collage");
        radha.setAddress("Near Sheela takije Dhampur Distt. Bijnor Uttar Pradesh");
        radha.setBord("U.P bord Allahabad");
        radha.setQuainty(2500);
        radha.setPhysicsStudentQty(1500);
        radha.setClassStudents(150);
        radha.setPrincipalName("Mr. Prem Chandra");
        radha.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        radha.setSchoolOnerName("Mr. Radha Chauhan");
        radha.setTeachersQty(53);

        schoolList[1]=radha;


        Schools rsm = new Schools();
        rsm.setName("RSM inter collage");
        rsm.setAddress("Dhampur Distt. Bijnor Uttar Pradesh");
        rsm.setBord("U.P bord Allahabad");
        rsm.setQuainty(2500);
        rsm.setPhysicsStudentQty(1500);
        rsm.setClassStudents(150);
        rsm.setPrincipalName("Mr. XYZ");
        rsm.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        rsm.setSchoolOnerName("Mr. Radha Chauhan");
        rsm.setTeachersQty(53);

        schoolList[2] = rsm;


        Schools km = new Schools();
        km.setName("KM inter collage");
        km.setAddress("Dhampur Distt. Bijnor Uttar Pradesh");
        km.setBord("U.P bord Allahabad");
        km.setQuainty(2500);
        km.setPhysicsStudentQty(1500);
        km.setClassStudents(150);
        km.setPrincipalName("Mr. XYZ");
        km.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        km.setSchoolOnerName("Mr. Karodhi mal");
        km.setTeachersQty(53);

        schoolList[3]= km;

        Schools sentmarry = new Schools();
        sentmarry.setName("SentMarry School");
        sentmarry.setAddress("Dhampur Distt. Bijnor Uttar Pradesh");
        sentmarry.setBord("C.B.S.C bord Delhi");
        sentmarry.setQuainty(2500);
        sentmarry.setPhysicsStudentQty(1500);
        sentmarry.setClassStudents(150);
        sentmarry.setPrincipalName("Mr. XYZ");
        sentmarry.setPrincipalAddress("Ranibag Colony Dhampur Bijnor");
        sentmarry.setSchoolOnerName("Mr. XYZ");
        sentmarry.setTeachersQty(53);

        schoolList[4] = sentmarry;

        for (int i = 0; i <= schoolList.length-1; i = i + 1){
            schoolList[i].getName();
            schoolList[i].getAddress();
            schoolList[i].getBord();
            schoolList[i].getQuainty();
            schoolList[i].getPhysicsStudentQty();
            schoolList[i].getClassStudents();
            schoolList[i].getPrincipalName();
            schoolList[i].getPrincipalAddress();
            schoolList[i].getSchoolOnerName();
            schoolList[i].getTeachersQty();
            System.out.println(schoolList[i].getName()+","+ schoolList[i].getAddress()+","+ schoolList[i].getBord()+","+ schoolList[i].getQuainty()+ "," + schoolList[i].getPhysicsStudentQty()+"," + schoolList[i].getClassStudents()+"," + schoolList[i].getPrincipalName()+","+ schoolList[i].getPrincipalAddress()+","+ schoolList[i].getSchoolOnerName()+ ","+ schoolList[i].getTeachersQty());

        }

    }
}
