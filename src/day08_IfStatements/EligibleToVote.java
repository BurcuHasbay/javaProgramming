package day08_IfStatements;

public class EligibleToVote {


    public static void main(String[] args) {

        String name = "Burcu",
                citizen = "Turkey";
        int age = 29;

        boolean isEligible = age >= 18 && citizen == "Turkey";

        //Eligible
        if (isEligible){
            System.out.println("Eligible");}

        //not Eligible

        if (!isEligible){
            System.out.println("Not Eligible");}
















    }


















}
