import java.util.Scanner;

public class Realestate {


    public static void main(String[] args)  {
        int studentcounter =1;
        int passescount=0;
        int failscount=0;
        int grade;

        Scanner scanner=new Scanner(System.in);

        while (studentcounter <= 10)   {
            System.out.println("enter your result");
            grade =scanner.nextInt();
            studentcounter++;
            if(grade ==1) {
                passescount++;

            }
            if (grade ==2)   {
                failscount++;
            }

            if (passescount >8)    {
                System.out.println("bonus to instructor");

            }
            System.out.printf("total passes %d\n total failure%d\n",passescount, failscount);



        }


    }

}
