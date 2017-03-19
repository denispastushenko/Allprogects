import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.Helper.lineSeparator;

public class Task9_4 {
   private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[][] array = {{2, -4, -6, 4, 5},
                {-2, 4, -6, 3, 8},
                {-1, -4, 6, -4, 5},
                {9, 24, -6, -44, 8},
                {0, -4, 6, 4, 5}};
        System.out.println(Arrays.deepToString(array));
        firstPositiveDigitInLine(array);
        sum(list);
    }

    private static void firstPositiveDigitInLine(int[][] array) {
        System.out.println(lineSeparator());

        for (int arr[] : array) {
            int i = 0;
int k =arr[i];
            int j = arr.length - 1;
            for (; i < arr.length; i++) {
                if (arr[i] >= 0 && arr[i + 1] < 0) {
                    System.out.println(" " + arr[i]);
                    break;

                }


            }
            for (; j>i; j--) {
                if (arr[j] >= 0 && arr[j - 1] < 0) {
                    System.out.println(" " + arr[j] + lineSeparator());
                    break;
                }
            }
            while (i >= 0 && j >= 0) {
                i++;
                j--;
                if ((i > 0 && j > 0) && i != j) {
                    System.out.println(" " + arr[i] + " " + arr[j] + lineSeparator());
                    System.out.println("Sum " + (arr[i] + arr[j]) + lineSeparator());
                    list.add(arr[i] + arr[j]);
                    System.out.println(list);
                    break;

                } else System.out.println("Sum" + arr[i] + lineSeparator());
                System.out.println(arr[i] + lineSeparator());
                list.add(arr[i]);
                System.out.println(list);
                break;

            }

        }
    }



    private static void sum(List<Integer> list) {
        System.out.println(lineSeparator());
        int sum=0;
        for (Integer arr : list) {

          sum+=arr;

        }
        System.out.println(sum);
    }}

