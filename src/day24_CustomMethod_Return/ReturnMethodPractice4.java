package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

String str = "aabccdee";

      //this is for only one char//  int frequency=frequency(str,'a' );
        for (int i = 0; i <str.length() ; i++) {
            int frequency = frequency(str,str.charAt(i));
 
    //to find the unique character
            if (frequency ==1){
                System.out.println(str.charAt(i));
            }

        }





    }
public static int frequency(String str, char ch){

        int count = 0;

    for (char each: str.toCharArray()){
        if (each==ch){
            count++;
    }


    }

    return count;
}




}
