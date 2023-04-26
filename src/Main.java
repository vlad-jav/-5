import java.awt.*;

public class Main {


    public static void print(String str) {
        System.out.println(" привет  "+ str);


    }

    public static void main(String[] arge) {
        int[] list = new int[10];
        list[0] =1 ;
        list[1] =3;
        list[5] = 4;
        for (int i = 0; i < 100; i++ ){
            if (i % 2 == 0){
                System.out.println( i);
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
 //           if (list.get(i) % 2 == 0) {
 //               list.set(i, list.get(i) + 1);
//                              System.out.println("");
            }


        }

    }




//for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                list.set(i, list.get(i) + 1);
//