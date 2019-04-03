package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.Universitys;

public class UniversitysExeutor {
    public static void main(String... arg){
        Universitys ccs = new Universitys();
        ccs.setName("Choudhary Charan Singh University");
        ccs.setUniversityName("CCS University Meerut Uttar Predesh");
        ccs.setPrincipalName("Mr. XYZ");
        ccs.setBscStudent(2500);
        ccs.setMathesStudent(1500);
        ccs.setPhysicsStudent(1200);
        ccs.setUniversityAdderess("Meerut uttar Pradesh");
        ccs.setUniversityCorrecess("B.Sc, B.A, M.Sc(Mathes), M.A, LLB,");

        Universitys [] universityList = new Universitys[5];
        universityList[0] = ccs;

        Universitys mjp = new Universitys();
        mjp.setName("R.S.M PG Collage");
        mjp.setUniversityName("M.J.P.Ruhalkhend University Barilly Uttar Predesh");
        mjp.setPrincipalName("Mr. Raguveer Singh Chauhan");
        mjp.setBscStudent(2500);
        mjp.setMathesStudent(1500);
        mjp.setPhysicsStudent(1200);
        mjp.setUniversityAdderess("Barilly uttar Pradesh");
        mjp.setUniversityCorrecess("B.Sc, B.A, M.Sc(Mathes), M.A, LLB,");

        universityList[1] = mjp;

        Universitys delhiUniversity = new Universitys();
        delhiUniversity.setName("Delhi University");
        delhiUniversity.setUniversityName("Delhi University");
        delhiUniversity.setPrincipalName("Mr. Raguveer Singh Chauhan");
        delhiUniversity.setBscStudent(3500);
        delhiUniversity.setMathesStudent(1500);
        delhiUniversity.setPhysicsStudent(1200);
        delhiUniversity.setUniversityAdderess("Delhi");
        delhiUniversity.setUniversityCorrecess("B.Sc, B.A, M.Sc(Mathes), M.A, LLB,");

        universityList[2] = delhiUniversity;

        Universitys garwalUniversity = new Universitys();
        garwalUniversity.setName("Garwal University");
        garwalUniversity.setUniversityName("Garwal University");
        garwalUniversity.setPrincipalName("Mr. Raguveer Singh Chauhan");
        garwalUniversity.setBscStudent(3500);
        garwalUniversity.setMathesStudent(1500);
        garwalUniversity.setPhysicsStudent(1200);
        garwalUniversity.setUniversityAdderess("Uttarkhand");
        garwalUniversity.setUniversityCorrecess("B.Sc, B.A, M.Sc(Mathes), M.A, LLB,");

        universityList[3] = garwalUniversity;

        Universitys ptu = new Universitys();
        ptu.setName("Panjab Tecnical University");
        ptu.setUniversityName("Panjab Tecnical University");
        ptu.setPrincipalName("Mr. Raguveer Singh Chauhan");
        ptu.setBscStudent(3500);
        ptu.setMathesStudent(1500);
        ptu.setPhysicsStudent(1200);
        ptu.setUniversityAdderess("Panjab");
        ptu.setUniversityCorrecess("B.Sc, B.A, M.Sc(Mathes), M.A, LLB,");

        universityList[4] = ptu;

        for (int i = 0; i <= universityList.length-1; i = i + 1){
            universityList[i].getName();
            universityList[i].getUniversityName();
            universityList[i].getPrincipalName();
            universityList[i].getBscStudent();
            universityList[i].getMathesStudent();
            universityList[i].getPhysicsStudent();
            universityList[i].getUniversityAdderess();
            universityList[i].getUniversityCorrecess();
            System.out.println(universityList[i].getName()+ "," + universityList[i].getUniversityName()+ "," + universityList[i].getPrincipalName()+ "," +universityList[i].getBscStudent()+ ","+ universityList[i].getMathesStudent()+ ","+ universityList[i].getPhysicsStudent()+ "," + universityList[i].getUniversityAdderess()+ "," + universityList[i].getUniversityCorrecess());
        }

    }
}
