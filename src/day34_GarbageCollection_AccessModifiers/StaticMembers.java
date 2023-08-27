package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { //this is outer class. It cant be static. NO!

    static class class1 { //inner class. Nested class. Only this can be static class

    }

    public static int num = 100; // variable can be static

    public static void method() { // method can be static. If the method doesn't need any instance variable or instance method
        //than we can use static method

    }

    static { //Block can be static


    }
/*
If the static variable has several steps, you should use static BLOCK
 */

}

class A { //outer class

    static class B { //inner class // This Class B belongs to Class A

        public static void method() { //this method belongs to class B

        }
    }
}

class  C {
    static class B {
        public static void main(String[] args) {
            A.B.method(); // to call the method above, it has to move from outer to inner
        }
    }
}