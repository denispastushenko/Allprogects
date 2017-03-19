import java.util.Arrays;

public class ExampleCours {
    //bubbleSorter
    public static void main(String[] args) {
        int arr[] = {3, 11, 16, 8, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
  

 /*Girl girl1 = new Girl("blue","Black","Masha",20);
        System.out.println(girl1);
        girl1.age= 21;
girl1.goToCinema();
        girl1.igoToRestaurant("Mac");
        girl1.igoToRestaurant("Paris");*/


    }

    private static void sort(int[] arr) {

        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; barrier > index; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}
