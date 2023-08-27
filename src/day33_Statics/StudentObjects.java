package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {


        Student student1 = new Student("Burcu");
        Student student2 = new Student("Osman", 'M');
        Student student3 = new Student("Okan", 'M', 12345);
        Student student4 = new Student("Meftun Eda",3456,'F');
        Student student5 = new Student("Dünya",'F',30,3355);
        Student student6 = new Student("Esra",'F',43,7711,'A');
        Student student7 = new Student("İpek",'F',50,0112);


        Student[]students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

    }
}
