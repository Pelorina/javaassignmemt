import java.util.Scanner;

public class Whileloop {

    public static void main(String[]  args)   {

        int studentCounter=1;
        int score;
        double classaverage;
        int totalscore=0;

        Scanner scanner=new Scanner(System.in);
        System.out.printf("enter student %d's\n",studentCounter);
        score=scanner.nextInt();
        totalscore=totalscore + score;

        while (studentCounter < 10) {
            studentCounter=studentCounter+1;
            System.out.printf("enter student %d's score\n",studentCounter);
            score=scanner.nextInt();
            totalscore=totalscore;
            System.out.println("total score is" +totalscore);


        }
        classaverage=(double) totalscore /10;
        System.out.println("average");
    }
}
