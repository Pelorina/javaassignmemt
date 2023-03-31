package Emperor;

public class Stringunique {

    public static void main(String[] args) {
        String name ="oladele";
        String secondname="joshua";
        String thirdname =  new String("oloyede");

        System.out.println(name   + secondname + thirdname);
        System.out.println(secondname.length());
        System.out.println(thirdname.contains("ole"));
        System.out.println(name.toLowerCase());
        System.out.println(secondname.toUpperCase());
        System.out.println(name.indexOf(5));
        System.out.println(secondname.charAt(4));
        System.out.println(thirdname.indexOf("o"));
        System.out.println(name.toLowerCase().indexOf("a"));
        System.out.println(name.substring(3,6));

    }
}
