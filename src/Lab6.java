import java.util.Scanner;

public class Lab6 {
    public static void Lab6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range of numbers from a to b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count1 = 0; //Divisible by 3 and not divisible by 5
        int count2 = 0; //Squares of even numbers

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                count1++;
            }

            if (Math.sqrt(i) % 2 == 0) {
                count2++;
            }
        }
        System.out.println("The number of numbers that are divisible by 3 and not divisible by 5: " + count1);
        System.out.println("Squares of even numbers: " + count2);
    }
}