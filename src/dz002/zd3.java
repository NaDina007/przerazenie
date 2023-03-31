package dz002;

public class zd3 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, -18, 76, 21, 9, 41, 0, 38, -54, 84, -35, 17, 37};

//        if (numbers.length > 0) {

            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum / numbers.length);

//        }
    }
}


