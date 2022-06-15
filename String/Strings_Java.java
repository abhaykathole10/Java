public class Strings_Java {
    public static void main(String[] args) {

        System.out.println("Different methods that can be operated on strings");

        //length() method in string
        String name = "Abhay";
        int len = name.length();
        System.out.println("The length of string is " + len);

        //To lower and Upper case
        System.out.println("In lower case: " + name.toLowerCase());
        System.out.println("In upper case: " + name.toUpperCase());

        //trim() method in Java - REMOVES SPACES
        System.out.println("Trim in Java");
        String abc = "   Cristiano Ronaldo";

        //Without trim()
        System.out.println(abc);

        //With trim()
        System.out.println(abc.trim());

        //substring() method in Java
        String s = "abcdefghij";

        //print the substring starting after the given index -,-,-,4,5,6,7,8,9,10
        System.out.println(s.substring(4));

        //print a substring atrting at an index and ending at some index -,-,2,3,4,5,-,-,-,-,-
        System.out.println(s.substring(2,6));

        //replace() method in java string
        String p = "BECKHAM";

        //REplacin a 'character' constant with another 'character' constant
        System.out.println(p.replace('B','H'));

        //Replacing a "string" with other "string" from same string
        System.out.println(p.replace("BEC","HAM"));

        //Replacing a "string" with other "string" form no where
        System.out.println(p.replace("HAM","MAN"));

        //Replacing a single "string" with other multiple "string" form no where
        System.out.println(p.replace("B","GOT"));

        //startsWith() and endsWith() methods is java strings
        String r = "Lionel Messi";

        //Gives true or false
        System.out.println(r.startsWith("Lio"));

        //Gives true or false
        System.out.println(r.endsWith("naldo"));

        //charAt() method in java string

        String a = "0ABCDEFGHIJ";
        System.out.println(a.charAt(7));

        //indexOf() method in java Strings
        String b = "Karim Benzema";

        //Returns the index of the 1st occurence if not found then returns "-1"
        System.out.println(b.indexOf("zema"));

        //To search for a char or String from a specified index and return the main index else "-1"
        //Here "ar" is not present if we search from 6th index as it is at index "1"
        System.out.println(b.indexOf("ar", 6));

        //lastIndexOf() method in java Strings
        String q = "Mississispi";

        //Here "i" is occuring 4 times but we just need the last occurence
        System.out.println(q.lastIndexOf('i'));

        //Here "is" is occuring 2 times but we just need the last occurence
        System.out.println(q.lastIndexOf("is"));

        //Srats searching from right to left
        System.out.println(q.lastIndexOf("sis", 2));

        //equals() and equalsIgnoreCase() method in java string
        String c = "Neymar";
        System.out.println(c.equals("Neymar"));
        System.out.println(c.equalsIgnoreCase("NeYmAr"));


    }
}
