package z5;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number < 100 || number > 200 || number % 3 != 0) {
            number = input.nextInt();
            input.nextLine();
            if (number < 100) {
                System.out.println("Liczba jest za mala");
            } else if (number > 200) {
                System.out.println("Liczba jest za duza");
            } else if (number % 3 != 0) {
                System.out.println("Liczba jest niepodzielna przez 3");
            }
        }
        System.out.println("Liczba jest ok!");

    }
}
