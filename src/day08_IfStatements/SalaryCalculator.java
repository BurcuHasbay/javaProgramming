package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
               weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        //---------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
       double stateTax = salaryBeforeTax * stateTaxRate / 100;


        System.out.println("Gross pay is " + "$" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);

        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        System.out.println("federalTax =  $" + federalTax);
        double totalTax = federalTax + stateTax;

        System.out.println("totalTax = $" + totalTax);

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("The net income is "+ "$" + salaryAfterTax);







    }



}
