package day40_FinalKeyWord;

public class FinalVariable {

    public static void main(String[] args) {
        final String name;
        name= "Java";
        System.out.println(name);
        System.out.println("------------------");

        final double pi = 3.14;
        System.out.println(pi);

        System.out.println("-------------------");

        FinalVariable obj = new FinalVariable("February/14");
        System.out.println(obj.birthDay);

    }

final String birthDay;
    public FinalVariable (String birthDay){
        this.birthDay=birthDay;
    }



}
