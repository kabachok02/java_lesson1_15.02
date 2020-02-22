package lesson1;

public class factorial {
    public static void main(String[] args) {


        System.out.println(factRecursion(5));

    }

    private static int factRecursion(int n) {

        int result = 1;

        if (n == 1 || n == 0) {
            return result;
        }

        result = n * factRecursion(n-1);

        return result;


    }
}
