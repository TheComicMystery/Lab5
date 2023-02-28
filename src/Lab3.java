import java.util.Scanner;

public class Lab3 {
    public static void Lab3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter h: ");
        int h = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = a; i <= b; i += h) {
            sum += i;
            count++;
        }
        double average = sum / count;
        System.out.println("Average of numbers from " + a + " to " + b + " with step " + h + " is: " + average);
    }
}