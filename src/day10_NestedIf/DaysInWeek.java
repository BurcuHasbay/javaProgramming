package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;

        if (number == 1) {
            System.out.println("Monday");}
         else if (number == 2) {
            System.out.println("Tuesday"); }
        else if (number == 3) {
            System.out.println("Wednesday"); }
        else if (number == 4) {
            System.out.println("Thursday"); }
        else if (number == 5) {
            System.out.println("Friday"); }
        else if (number ==6) {
            System.out.println("Saturday");}
        else {
            System.out.println("Sunday");}

        System.out.println("---------------------------------");
int n = 5;
       String result2 = (n == 1)? "Monday" : (n==2)? "Tuesday" : (n==3)? "Wednesday" : (n==4)?
                "Thursday" : (n==5)? "Friday" : (n==6)? "Saturday" : "Sunday";

        System.out.println("result2 = " + result2);

        System.out.println("--------------------------------");

       int number2 = 5;

       String nameOfTheMonth = (number2 == 1)? "January" : (number2 == 2)? "February" :
                (number2 == 3)? "March" : (number2 ==4)? "April" :
                        (number2 ==5)? "May" : (number2==6)? "June"
                                : (number2 ==7)? "July" : (number2==8)? "August"
                                : (number2==9)? "September" : (number2==10)?
                                "October" : "December";


        System.out.println("nameOfTheMonth = " + nameOfTheMonth);








    }
}
