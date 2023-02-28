public class Lab4 {
    public static void Lab4(String[] args) {
        int x = 3;
        int y = 3;
        int result = 0;
        for (int i = 0; i < y; i++) {//For runs y times.
            result += x;//Everytime when for iterates, result will be increased by x.
        }
        System.out.println("The multiplication of " + x + " and " + y + " is: " + result);
    }
}