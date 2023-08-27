package day24_CustomMethod_Return;

public class Return_ExitMethod {
    public static void main(String[] args) {

    }

    public static void nameOfTheMonth(int number) {

        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return;
        }
        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" :
                (number == 3) ? "Mar" : (number == 4) ?
                        "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" :
                        (number == 7) ? "Jul" : (number == 8) ?
                                "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" :
                                (number == 11) ? "Nov" : "Dec";


    }
}
