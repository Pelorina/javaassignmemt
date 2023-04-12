import java.util.Scanner;

public class Beatifying {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = addFullStop(str);
        str = capitalizeFirstLetter(str);
        System.out.println("Beautified string: " + str);
    }
    public static String addFullStop(String str) {
        if (!str.endsWith(".")) {
            str += ".";
        }
        return str;
    }

    public static String capitalizeFirstLetter(String str) {
        if (str.length() > 0 && !Character.isUpperCase(str.charAt(0))) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }
}
