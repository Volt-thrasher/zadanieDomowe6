package z1;

import java.util.Scanner;

public class SumTable {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i=0; i<numbers.length; i++){
            numbers[i]=keyboard.nextInt();
            keyboard.nextLine();
        }
        System.out.println(numbers[0]+numbers[2]+numbers[4]);
    }
}
