import java.util.Scanner;

public class TESTINGwhile {


    private int classnumber = 1;
    private double grade;
    private double average;

    public TESTINGwhile(int classnumber, double grade, double average) {
        this.classnumber = classnumber;
        this.grade = grade;
        if (average < 0) {
            if (average >= 100) ;
            this.average = average;


        }
    }

    public void setClassnumber(int classnumber) {
        this.classnumber = classnumber;
    }

    public int getClassnumber() {
        return classnumber;
    }

    public double setGrade(double grade) {
        this.grade = grade;
        return grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setAverage(double average) {
        if (average > 0) {
            if (average <= 100) {
                this.average = average;

            }
        }
    }

    public static void main(String[] args) {
        int Classnumber = 1;
        double grades = 0;
        double total=0;
        Scanner scanner = new Scanner(System.in);

        while (Classnumber <= 10) {
            System.out.println("enter your score");
            int score = scanner.nextInt();
            System.out.println("total");
            Classnumber++;
        }
        double average =(total/10);
        System.out.println("average");


//        if (grades <= 90) {
//            System.out.println("a");
//         if (grades <= 80) {
//            System.out.println("b");
//        }if (grades <= 70) {
//            System.out.println("c");
//        } else {
//            System.out.println("failed");
//        }


    }
}
