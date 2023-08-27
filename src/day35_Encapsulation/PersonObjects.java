package day35_Encapsulation;

import day35_Encapsulation.Encapsulation.Person;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person();
// p1.name ="Daniel"; You can't do this. 'cause this data is private. No DIRECT ACCESS
        p1.setName("Burcu");
        p1.setAge(29);
        System.out.println(p1.getName() + " : "+ p1.getAge());

    }
}
