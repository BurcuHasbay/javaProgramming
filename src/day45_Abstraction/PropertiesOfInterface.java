package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;
    static int b = 200;

    //public PropertiesOfInterface (int a){
       // this.a= a;
    //}

// static {
//         b=100;
// }

/*public void method1(){
    System.out.println(" Instance Method ");
} NO OBJECT NO INSTANCE
*/

static void method2 (){
    System.out.println(" Static Method ");
}


default void method3 (){ // you can call this through the object
    System.out.println("Default Method");
}

void method4();

}

class Test implements PropertiesOfInterface{

    @Override
    public void method4() {
        
    }


    public static void main(String[] args) {





            new Test().method3();

        }
}