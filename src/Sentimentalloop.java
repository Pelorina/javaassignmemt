import java.util.Scanner;

public class Sentimentalloop {


    public static  void main(String Args)   {

    int score;
    int studentCounter=0;
    double average;
    int flagValue=-1;
    int totalscore=0;

        Scanner scanner=new Scanner(System.in);
        System.out.printf("enter score %d\n",studentCounter);
        score=scanner.nextInt();
        while (score != flagValue)  {
            ++studentCounter;
            System.out.printf("enter score %d\n",studentCounter);
            score=scanner.nextInt();
            totalscore=totalscore +score;
            System.out.println("total score is " +totalscore);

        }
        if (studentCounter !=0)   {
            average=(double) totalscore/studentCounter;
            System.out.printf("total number of student is %d\ntotal score is %d\naverage is %.2f", studentCounter, totalscore, average);

        }else {
            System.out.println("no grade were entered!");
        }



    }

}
