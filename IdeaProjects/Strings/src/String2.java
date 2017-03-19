
public class String2 {
    static String arr[] = {
            "Now", "is", "the", "time", "for", "good", "man",
            "to", "come", "to", "the", "aid", "of", "aid", "their", "country"

    };

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }


            }
            System.out.println(arr[i]);


        }
    }
}
