package lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean stop = false;

        String input = scanner.next();

        if (input.equals("stop")) {
            stop = true;
        }

        while (!stop) {  // stop != true  stop == false

            sum += Integer.parseInt(input);

            input = scanner.next();

            if (input.equals("stop")) {
                stop = true;

                System.out.println(sum);
            }

        }



    }
}
