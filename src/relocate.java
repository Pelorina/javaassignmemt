import java.util.Scanner;

public class relocate {
    public static void main(String[] args)      {
        double height;
        double weight;
        Scanner help = new Scanner(System.in);
        System.out.println("enter your height in meter");
        height= help.nextDouble();
        System.out.println("enter your weight in pounds");
        weight = help.nextDouble();
        double bmi =(height * 703/(weight * 2* weight));
        System.out.println(bmi);

        double miles;
        double gasoline;
        double average;
        double parking;
        double tolls;
        Scanner input= new Scanner(System.in);
        System.out.println("enter your total miles driven per day");
        miles= input.nextDouble();
        System.out.println("enter your cost of gasoline");
        gasoline= input.nextDouble();
        System.out.println("enter your average miles per gallon");
        average= input.nextDouble();
        System.out.println("enter your parking fees per day");
        parking = input.nextDouble();
        System.out.println("enter your tolls per day");
        tolls= input.nextDouble();
        double result = (miles/average *gasoline);
        System.out.println("result");





    }
}
