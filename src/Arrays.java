public class Arrays {

    public static void main(String[] args) {
        String[] nameofstudent = new String[4];
        System.out.println(nameofstudent.length);
        nameofstudent = new String[]{"tobi", "oyin", "sarah", "noah"};
        System.out.println(nameofstudent[2]);
        int[] ageofstudent = new int[4];
        ageofstudent = new int[]{1, 2, 3, 4};
        nameofstudent[1]="musa";
        System.out.println(nameofstudent[1]);
        System.out.println(nameofstudent);
        System.out.println(java.util.Arrays.toString(nameofstudent));



        for (int i = 0; i < nameofstudent.length ; i++) {
            System.out.println(nameofstudent[i]);

        }

        }
    }

