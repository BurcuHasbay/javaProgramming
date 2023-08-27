package day21_ForEachLoop;public class InitialNames {

    public static void main(String[] args) {
String [] names = {"Burcu Hasbay", "Osman Mert", "Nurten Yıldırım", "Niyazi Mert", "Müjgan Mert",
"İpek Tan", "Meltem Karaketir", "Oğuzhan Uğur"};


        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }










    }
}
