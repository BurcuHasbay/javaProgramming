package day14_String;

public class EmailTask {

    public static void main(String[] args) {


        String email = "burcu.hasbay@gmail.com";

        String firstName = email.substring(0,email.indexOf(".")+1);
        String lastName = email.substring(email.indexOf(".")+1,email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));
        email = firstName + lastName + rest;

        System.out.println(email);





    }
}
