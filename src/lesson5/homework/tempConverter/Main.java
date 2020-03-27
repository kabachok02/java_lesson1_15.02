package lesson5.homework.tempConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the temperature value and the temperature symbol you would like to convert to (F - Fahrenheit, K - Kelvin)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input1 = bufferedReader.readLine();
        String input2 = bufferedReader.readLine();
        int temp = Integer.parseInt(input1);

        Converter converter = new Temperature();

        converter.convertTemp(temp, input2);

    }
}
