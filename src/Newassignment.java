import java.security.SecureRandom;
import java.util.Scanner;

public class Newassignment {

    public static double hypotenuse(double side1, double side2) {
        double hypo = Math.hypot(side1, side2);

        return hypo;
    }

    public static void isperfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + "is a perfect number");
        }

    }

//    method for prime number

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(hypotenuse(5.0, 3.0));
        isperfect(6);
        isperfect(48);

        for (int i = 1; i <= 1000; i++) {
            isperfect(i);

        }
        System.out.println();
        System.out.println();
        isPrime(7);
        isPrime(8);
        System.out.println();
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }

        }
//       Scanner scanner=new Scanner(System.in); USER INPUT
//        int sum=0;
//        System.out.println();
//       Scanner scanner=new Scanner(System.in);
//        System.out.println("enter your four digit");
//        int input= scanner.nextInt();
//            sum+=input%10;
//              input/=10;
//            System.out.println(sum);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first number");
        int firstnumber = scanner.nextInt();
        System.out.println("enter your second number");
        int secondnmber = scanner.nextInt();
        System.out.println("enter yor third number");
        int thirdnumber = scanner.nextInt();
        System.out.println("enter your furth number");
        int fourthnumber = scanner.nextInt();
        int sum = (firstnumber + secondnmber + thirdnumber + fourthnumber);
        System.out.println(sum);

//        GUESS the number.
        System.out.println();
        SecureRandom random = new SecureRandom();
        int playernumber = random.nextInt(1000);
        System.out.println(playernumber);
        Scanner output = new Scanner(System.in);
        int attempt = 1;
        while (attempt < 3) {
            System.out.println("enter any number");
            int number = output.nextInt();

            if (number == playernumber) {
                System.out.println("congratulation you guessed the number");
                break;
            } else if (number < playernumber) {
                System.out.println("too low try again");
            } else {
                System.out.println("too high try again");
            }
            attempt++;
            if (attempt == 3) {
                System.out.println("game over. play again or stop");
                break;
            }

        }
    }

}














