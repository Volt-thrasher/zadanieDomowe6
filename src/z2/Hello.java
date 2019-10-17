package z2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String names[] = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = keyboard.nextLine();
        }
        keyboard.close();
        int i = names.length;
        while (i >0) {
            i--;
            System.out.println("Czesc, " + names[i] + "!");
        }
    }
}
