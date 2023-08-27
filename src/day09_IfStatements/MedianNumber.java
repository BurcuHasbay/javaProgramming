package day09_IfStatements;

public class MedianNumber {


    public static void main(String[] args) {

    int a = 10,
            b= 20,
            c = 30;
                  //          a= 20 b=10  c=30     a= 20 b= 30 c=10
    boolean aIsMedianNumber = (a > b && a < c) || ( a < c && a > b);

    //                        a= 10 b=20 c=30   a=30 b=20 c=10
    boolean bIsMedianNumber = (b > a && b<c) || (b<a && b>c);

    boolean cIsMedianNumber = (c>a && c<b) || (c>b && c<a);
                             // !aIsMedian && !bIsMedian;

        if (aIsMedianNumber){
            System.out.println(a + " is a median number.");}
        if (bIsMedianNumber){
            System.out.println(b + " is a median number.");}
        if (cIsMedianNumber){
            System.out.println(c + " is a median number.");}


















    }
}
