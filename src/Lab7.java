public class Lab7 {
    public static void Lab7(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { //Looping through each term in the series.
                sum += (1 + i + j); //Adding each term to the sum.
            }
        }
        System.out.println("The sum of the series is: " + sum);
    }
}