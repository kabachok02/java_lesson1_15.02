package lesson5.homework.tempConverter;

public interface Converter {
    default String convertTemp(int temp, String convertTo) {

        int res = 0;
        switch (convertTo) {
            case "F":
                res = (temp * 9/5) + 32;
                break;
            case "K":
                res = temp + 273;
                break;
        }
        String result = "Result: " +res;
        System.out.println(result);
        return result;

    }
}
