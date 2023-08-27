package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String [] names = {"Burcu Hasbay", "Osman Mert", "Nurten Yildirim", "Niyazi Mert", "Müjgan Mert",
                "İpek Tan", "Meltem Karaketir", "Oguzhan Ugur"};

        for (String each : names) {
            String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }











    }
}
