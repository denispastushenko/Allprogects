import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.Helper.fillMatrix;

public class Task9_7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        fillMatrix(array);
        for (int[] anArray : array) {

                list.add(Arrays.deepToString(anArray));





        }
        System.out.println(list);


    }

}
