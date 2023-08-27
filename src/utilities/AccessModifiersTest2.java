package utilities;

import day40_FinalKeyWord.ProtectedAccessModifier;

public class AccessModifiersTest2 extends ProtectedAccessModifier {
    public static void main(String[] args) {


       // System.out.println(AccessModifiersTest2.name1); Default is not visible outside the package
        System.out.println(AccessModifiersTest2.name2);


       // AccessModifiersTest2.method1(); Default is not visible outside the package
        AccessModifiersTest2.method2();

        /*
        Protected access modifier: - Always visible within the same package
                                   - Visible outside the package in subclass ONLY
         */

    }
}
