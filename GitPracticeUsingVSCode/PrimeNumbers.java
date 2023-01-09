import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {

        int temp;
        boolean isPrime = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");

        int num = scanner.nextInt();

        for (int i = 2; i < num / 2; i++) {

            if (num % i == 0) {
                isPrime = true;
                break;
            }

        }
        if (!isPrime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
