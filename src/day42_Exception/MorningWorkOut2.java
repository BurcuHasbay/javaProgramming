package day42_Exception;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.swing.plaf.TableHeaderUI;
import java.util.TreeMap;

public class MorningWorkOut2 {
    public static void main(String[] args) {

        System.out.println("--------Push ups started---------");
        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPush ups" + i);

            sleep(2.5);


        }
        System.out.println("----------Push ups completed---------");

        System.out.println("------------Pull ups started---------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPull ups" + i);
            sleep(2.5);

        }

        System.out.println("----------Pull ups completed ------------");


    }

    //                               2.5
    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
