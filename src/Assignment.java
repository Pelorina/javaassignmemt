import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int number=1;
        int totalnumber=0;
        int NUMBER;
        Scanner scanner=new Scanner(System.in);

        while (number<=5)   {
            System.out.println("ENTER YOUR NUMBER");
            NUMBER=scanner.nextInt();
            number++;

          totalnumber=totalnumber + NUMBER;
            System.out.println("total number is" + totalnumber);

        }
    }
}
