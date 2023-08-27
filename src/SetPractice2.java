import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", " Pen", "Phone","Wooden Spoon",
                "Wooden Spoon", " Eggs", "Wooden Spoon","MILK", "Coke", "Chakıl"};
//Faster way (DOWN)

    arr=new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        //Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        //arr= set1.toArray(new String[0]);
        // This is the way to convert Set to Array (UP)



        System.out.println(Arrays.toString(arr));
        System.out.println("------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1000,300,1000,300,400,500,600,10,10,20,30,40,30,20,10));

        System.out.println(list2);
        System.out.println("---------------");


        list2= new ArrayList<>(new LinkedHashSet<>(list2));
        System.out.println(list2);


        System.out.println("--------------------------------");

        String [] array = {"A", "B", "C"};

        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("E", "F","G"));

        System.out.println("------------------------");

String str = "aaaabbbbcccccdddeeeee";

        String result = ""; //a4b4c5d3e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result+= each+Collections.frequency(Arrays.asList(str.split("")),each);
     //  result+= each+count;
        }
        System.out.println(result);








        System.out.println("----------------------------");


Integer[] num = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10};

num= new LinkedHashSet <> (Arrays.asList(num)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(num));

        System.out.println("------------------------------");

        Set<String>names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet","Ahmet","John","James","Breanna","Shay","Ahmet"));


        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4) );

        for (String each:names) {
            System.out.println(each);
        }






    }
}
