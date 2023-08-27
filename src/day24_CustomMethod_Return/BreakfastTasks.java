package day24_CustomMethod_Return;

public class BreakfastTasks {


    public static void main(String[] args) {
        initials("Burcu", "Hasbay");

        domain("burcu.hasbay@gmail.com");

        System.out.println("---------------------------");

        String[] emails = {"burcu.hasbay@gmail.com", "osmnmrt64@yahoo.com", "ali.hhasbay@hotmail.com"};
        for (String email : emails) {
            domain(email);
        }

        nameOfTheMonth(6);


    }

    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }


//2. Create a method that can display the domain of the email

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    // 3. Create a method that can display the name
    // of the month based on the given number to the method
    public static void nameOfTheMonth(int number) {

        String name = "";
        if (number >= 1 && number <= 12) {
            name= (number==1)?"Jan" : (number==2)?"Feb": (number==3)?"Mar": (number==4)?
                    "Apr": (number==5)?"May": (number==6)?"Jun": (number==7)?"Jul":(number==8)?
                    "Aug": (number==9)?"Sep": (number==10)?"Oct": (number==11)?"Nov": "Dec"
                    ;
        } else {
            name = "invalid";
        }

        System.out.println("Month Name: "+ name);
    }

//	5. Create a method that can print how many days a month has

public static void daysInMonth (int number){

}

}












/*

Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has



method: grouping code fragments ===> creating a function

			advantage: improves the re-usability of our codes
         */