package day08_IfStatements;

public class LogicalOperators {


    public static void main(String[] args) {

        String name = "Steven",
                citizen = "UK";
        int age = 19;

        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("--------------------------------------");

        String name1 = "John";
        int creditScore = 720,
                age1 = 29,
                income = 3500;

        boolean isEligible2 = creditScore >= 700 && age1 >= 25 && income >= 4500;

        System.out.println(name1 + " is eligible to take out loan: " + isEligible2);

        int age2 = 28;
        char gender = 'F';
        boolean isEligible3 = age2 >= 25 && !(gender == 'M' || gender == 'F');

        System.out.println(age2 + " is eligible to register: " + isEligible3);

        System.out.println("-------------------------------------------------------");

        String name3 = "Burcu",
                countryOfBirth = "Turkey";
        boolean marriedtoUSACitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedtoUSACitizen == true;

        System.out.println(name3 + " is eligible to apply for USA citizenship: "+ isEligible4);

        System.out.println("---------------------------------------");

        int score = 85;
        boolean passed = score >= 60,
                failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


















    }
}
