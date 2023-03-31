public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average >= 0) {
            if (average <= 100) {
            } else {
                System.out.println("your average is out of range");
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        if (average>= 0){
            if (average<=100){
                this.average=average;

            }else {
                System.out.println("your average is out of range");
            }
        }
    }

    public double getAverage() {
        return average;
    }

    public String getletterGrade(){
        String grade;
        if (average>= 80) {
            grade = "a";

        } else if (average>=70) {
            grade="b";


        } else if (average>=60) {
            grade ="c";


        }else {
            grade ="d";


        }
        System.out.println(grade);
        return grade;

    }
}