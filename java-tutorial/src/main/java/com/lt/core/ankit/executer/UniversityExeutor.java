package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.University;

public class UniversityExeutor {
    public static void main(String... arg){
        University mjp = new University();
        mjp.setName("R.S.M PG Collage");
        mjp.setUniversityName("M.J.P.Ruhalkhend University Barilly Uttar Predesh");
        mjp.setPrincipalName("Mr. Raguveer Singh Chauhan");
        mjp.setBscStudent(2500);
        mjp.setMathesStudent(1500);
        mjp.setPhysicsStudent(1200);
        mjp.setUniversityAdderess("Barilly uttar Pradesh");
        mjp.setUniversityCorrecess("B.Sc, B.A, M.Sc(Mathes), M.A, LLB,");
        System.out.println(mjp.getName()+ ", " + mjp.getUniversityName()+", " + mjp.getPrincipalName()+ ","+ mjp.getBscStudent()+ " ," + mjp.getMathesStudent()+","+ mjp.getPhysicsStudent()+","+ mjp.getUniversityAdderess()+ "," + mjp.getUniversityCorrecess());
    }
}
