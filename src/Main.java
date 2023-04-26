import java.util.Arrays;

public class Main {

    {
        System.out.println(" курасавая работа № 5 ");
    }

    private static boolean[] list;

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]++;

                System.out.println(Arrays.toString(numbers));
            } else {
                System.out.println(i);
            }
        }
        for (int i = 2; i < 7 && i < args.length; ) {
            long[] arr;
            arr = new long[0];
            numbers.wait(arr[i]);
            System.out.println(i);

        }
    }
}












  //  List sublist = new ArrayList<>();
//for (int i = 2; i < 7 && i < arr.length; i++) {
//        sublist.add(arr[i]);
 //       }
 //       return sublist;
 //       }

