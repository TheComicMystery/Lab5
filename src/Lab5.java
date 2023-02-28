public class Lab5 {
    public static void Lab5(String[] args) {
        int n = 7;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += (2 * i - 1);//Add to result (2n - 1)
        }
        System.out.println(n + "^2 = " + result);
    }
}