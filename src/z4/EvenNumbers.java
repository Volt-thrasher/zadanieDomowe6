package z4;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
                int sum = 0;
        for (int i = 0; i < 101; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
