package day43_Abstraction.EmployeeTask;

public abstract class Employee extends Person{

    private final int id;
    public String jobTitle;

    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id <=0){
            throw new RuntimeException("Invalid ID: " + id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <=0){
            throw new RuntimeException("Invalid Salary "+ salary);
        }
        this.salary = salary;
    }

    public abstract void work();


    public String toString() {
        return "Employee{" +
                " name= " + getName() +
                " id= " + id +
                " age= " + getAge() +
                " gender= " + getGender() +
                " jobTitle= " + jobTitle + '\'' +
                " salary=  $" + salary +
                '}';
    }
}
