package day04_Variables;
public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 40;
        int weeklyHours = 30;
        int numberofWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberofWeeks;

        System.out.println("hourlyRate = TL" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberofWeeks = TL" + numberofWeeks);
        System.out.println("salary = " + salary);

    }



    }
