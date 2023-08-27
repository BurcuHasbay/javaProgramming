package day25_CustomMethod_Overloading;

public class SumOfNotes {
    public static void main(String[] args) {
        int sum2 = sumOf2Numbers(45, 85);
        System.out.println("sum2= " + sum2);


        int sum3 = sumOf3Numbers(35, 45, 85); 
        System.out.println("sum3= " + sum3);

        int sum4 = sumOf4Numbers(65, 35, 45, 85);
        System.out.println("sum4= " + sum4);

    }

    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}
