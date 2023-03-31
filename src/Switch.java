public class Switch {

    public static void main(String[] args) {


        String firstname = "christian";
        String lastname = "ganiyu";
        String familyname = new String("joaquim");

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(familyname);

        System.out.println(firstname.toLowerCase());
        System.out.println(lastname.toUpperCase());
        System.out.println(familyname.substring(4));
        System.out.println(familyname.substring(4,6));
        System.out.println(firstname.charAt(4));
        System.out.println(familyname.charAt(6));
        System.out.println(lastname.length());
        System.out.println(firstname.length());
        System.out.println(familyname.length());
        System.out.println(lastname.indexOf("a"));
        System.out.println(familyname.indexOf("o"));
        System.out.println(familyname.contains("joq"));
    }
}
