import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        for(int count = 0; count<10;count++) {
            System.out.println("Please enter number " + (count+1) + ":");
            num = keyboard.nextInt();
            total += num;
        }
        System.out.println("The total of all 10 numbers is " + total);

    }

}