package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {


    public static void main(String[] args) {


//Person = new Person( "Burcu",29,'F'); This Person class is ABSTRACT
        //That is why you cannot create an object

//Employee employee = new Employee() This class is an abstract class TOO!


        Tester Tester = new Tester("Burcu",29,'F',49850,"Tester",1500);
        Developer Developer = new Developer("Osman",30,'M',102223,"Developer",2000);
        Teacher Teacher = new Teacher("Ayşegül",40,'F',104455,"Teacher",1000);
        Driver Driver = new Driver("Aydın",50,'M',123455,"Driver",500);

        System.out.println(Tester);
        System.out.println(Developer);
        System.out.println(Teacher);
        System.out.println(Driver);





    }

}
