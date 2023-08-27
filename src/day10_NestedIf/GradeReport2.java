package day10_NestedIf;

public class GradeReport2 {


    public static void main(String[] args) {



        /*
        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                result ="Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result ="Failed";
            }

*/

      int scoreT = 78;
      String result1 = "";

       result1 = (scoreT >= 0 && scoreT <= 100)?  (scoreT>=90)?
                "Excellent" : (scoreT >80)? "Great" : (scoreT >70)?
                "Good" : (scoreT > 60)? "Passed" : "Failed" : "Invalid Score";



        System.out.println(result1);





    }
}
