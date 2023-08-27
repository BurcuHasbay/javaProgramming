package day35_Encapsulation.Encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Burcu",'F',29,1500);

        System.out.println(employee1);

        employee1.setAge(30); // you can change the data like this. 'Cause data is private

        employee1.setSalary(employee1.getSalary() + 500);
        System.out.println(employee1);

    }
}
