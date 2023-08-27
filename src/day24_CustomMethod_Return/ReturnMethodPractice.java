package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

// find the mac number between 100 & 200

//multiply the mac number by 2.

        int max = maxNumber(100, 200);

        int multiplication = max * 2;

    }

    public static int maxNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }


}
