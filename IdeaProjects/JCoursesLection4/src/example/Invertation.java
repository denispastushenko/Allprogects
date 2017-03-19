package example;

import java.util.Arrays;

public class Invertation{
    public  static void invert(int[]arr){

        for(int i =0;i<arr.length/2;i++){
            int tmp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
