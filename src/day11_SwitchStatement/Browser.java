package day11_SwitchStatement;

public class Browser {

    public static void main(String[] args) {



        String browserName = "Chrome";
        String result = "";
        boolean validBrowsers = browserName == "Firefox" || browserName == "Chrome" ||
                browserName == "Opera" || browserName == "Safari"
                || browserName == "Edge";

        if (validBrowsers) {

            if (browserName == "Chrome") {
                result = "Chrome is selected";
            } else if (browserName == "FireFoz") {
                result = "FireFox is selected";
            } else if (browserName == "Opera") {
                result = "Opera is selected";
            } else if (browserName == "Safari") {
                result = "Safari is selected";
            } else {
                result = "Edge is selected";
            }
        } else { result = "Invalid Browser Name";}

        System.out.println("result = " + result);


















}
}




