package lesson3.homework;

public class Task1 {


    public static class Util {

        public static void main(String[] args) {
            getDistance(4, 2, 8, 5);
        }

        public static void getDistance (int x1, int y1, int x2, int y2) {
            int differenceX = x2 - x1;

            int differenceY = y2 - y1;

            double distance = Math.sqrt(differenceX * differenceX + differenceY * differenceY);

            System.out.println("Расстояние между точками = " + distance);
        }


    }

}
