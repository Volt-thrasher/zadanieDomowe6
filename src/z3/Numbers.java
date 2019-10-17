package z3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double i = 0;
        //     while (i<3.1){
        //       System.out.printf(" %2.1f", i);
        //     i+=0.1;
        //  }
        do {
            System.out.printf(" %2.1f", i);
            i += 0.1;
        } while (i < 3.1);
        keyboard.close();
    }
}
