package dz002;

import java.util.Random;

public class zd2 {
    public static void main(String[] args) {
//        Random num = new Random();
//        int i = num.nextInt(100); //випадкове ціле число до 100
//        // яйцо i = курица.дайСлучайноеЯйцо(размеромДо100)
//
//        int[] aLotOf = num;
//        System.out.println(num);
//        System.out.println(1);


        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + ", ");
            }
        }
    }
