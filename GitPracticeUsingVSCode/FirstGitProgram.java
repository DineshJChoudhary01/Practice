import java.util.Scanner;

class FirstGitProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scanner.nextInt();
        FirstGitProgram firstGitProgram = new FirstGitProgram();
        int output = firstGitProgram.factorialUsingRecursin(x);
        System.out.println("The factorial of " + x + " is " + output);
    }

    public int factorialUsingRecursin(int n) {

        int result = 1;
        if (n >= 1) {
            result = n * factorialUsingRecursin(n - 1);

        } else {
            return 1;
        }
        return result;

    }
}