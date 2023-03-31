import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num1 = 56;
        int num2 = 43;
        int answer = num1+num2;
        System.out.print(answer);
        int first;
        int second;
        int third;
        Scanner aduke =new Scanner(System.in);
        System.out.println("enter the first number ");
        first = aduke.nextInt();
        System.out.println("enter the second number");
        second = aduke.nextInt();
        System.out.println("enter the third number");
        third = aduke.nextInt();
        int realanswer = first * second * third;
        System.out.println(realanswer)   ;

      int firstnumber;
      int secondnumber;
      int thirdnumber;
      Scanner admin = new Scanner(System.in);
      System.out.println("enter first number please");
      firstnumber= admin.nextInt();
      System.out.println("enter second number please");
      secondnumber= admin.nextInt();
      System.out.println("enter third number please");
      thirdnumber= admin.nextInt();
      int total= firstnumber + secondnumber + thirdnumber;
      System.out.println(total);
        int average = (firstnumber + secondnumber + thirdnumber)/3;
        System.out.println(average);
        int product =(firstnumber* secondnumber * thirdnumber );
        System.out.println(product);













    }
}