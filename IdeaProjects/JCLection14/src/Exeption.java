import java.io.IOException;

public class Exeption {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");

            } finally {
                if (true) {

                        throw new IOException("b");

                    }
                    System.err.println("c");
                }
            } catch (IOException e) {
            System.err.println(e.getMessage());
        }catch (Exception ex){
            System.err.println("d");
            System.err.println(ex.getMessage());

        }

    }
}
