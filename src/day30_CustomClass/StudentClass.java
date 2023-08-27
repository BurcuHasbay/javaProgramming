package day30_CustomClass;

import java.util.ArrayList;

public class StudentClass {

    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Burcu", 'F', 29, 236294, 'B');

        Student student2 = new Student();
        student2.setInfo("Osman", 'M', 30, 11639335, 'A');

       Student student3 = new Student();
       student3.setInfo("Esra", 'F', 38, 0303777,'B');


        Student[] students = {student1,student2,student3};
        for (Student each : students) {
            System.out.println(each);
        }


        System.out.println("------------------------------");
    ArrayList<Student> earlyBirds = new ArrayList<>();
    ArrayList<Student> angryBirds = new ArrayList<>();
        for (Student each :students) {
            if (each.grade == 'A'){
                earlyBirds.add(each);
            }else {
                angryBirds.add(each);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }

}
