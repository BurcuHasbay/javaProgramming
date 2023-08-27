package day36_Inheritance;

public class Student {

public String name;
public int age;
public char gender, grade;
public String schoolName;

/*
    public Student(String name, int age, char gender, char grade, String schoolName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.schoolName = schoolName;

        if you have some conditions in the setter part and use constructor, the changes you made will NOT work unless you use setName(name);
    }
*/

    public static boolean isStudent = true;
    public static boolean isHuman= true;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >5 || age >90){
            return; // it quits the function
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender== 'F')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A'|| grade == 'B' || grade== 'C'|| grade=='D'|| grade=='F')){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

public void study(){
    System.out.println(name + " is studying");
}
















/*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set to less than 5 or greater than 90
						2. gender should not be set to any character other than: 'M' and 'F'
						3. grade should not be set to any ch other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all aractersthe fields when the object is created
						(requirements of fileds in the above must be applied)


			Methods:
				study()
				toString()
 */




}
