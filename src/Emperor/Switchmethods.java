package Emperor;

import java.util.Scanner;

public class Switchmethods {

    public static void main(String[] args) {
        int classcounter = 1;
        int score = 0;
        int grades;
        Scanner scanner = new Scanner(System.in);

        while (classcounter <= 10) {
            System.out.println("enter your grades");
            grades = scanner.nextInt();
            classcounter++;

            switch (grades / 10) {
                case 9, 8, 7:
                    if (grades <= 90) {
                        System.out.println("a");
                        break;
                    }
                case 6:
                    if (grades <=60)   {
                        System.out.println("b");
                        break;
                    }
                    if (grades <=50)   {
                        System.out.println("c");
                        break;
                    }
                default:
                    System.out.println("f");
            }
        }
    }
}
