package day09_IfStatements;

public class MinNumber {


    public static void main(String[] args) {

        int n1 = 100,
                n2 = 200;

        boolean n1isMin = n1 < n2;
        boolean n2isMin = n1 > n2;
        boolean equal = n1 == n2;

        if (n1isMin) {
            System.out.println( n1 + " is the minimum number.");}
        if (n2isMin){
            System.out.println(n2 + " is the minimum number.");}
        if (equal){
            System.out.println("Equal");}





















    }
}
