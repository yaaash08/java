import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Firstname = sc.nextLine();
        String Lastname = sc.nextLine();
       //Concatenation
        String sentence = Firstname + " " +Lastname;

        System.out.println(sentence);
        //CHARat
        System.out.println(sentence.charAt(5));
        //Comparing Two Strings
        if (Firstname.compareTo(Lastname)==0) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //Susbstring
        String name = sentence.substring(0, 4);
        System.out.println(name);

        //ParseInt
        String str = "123";
        int integer = Integer.parseInt(str);
        System.out.println(integer);

        //ToString
        int number = 123;
        String str1 = Integer.toString(number);
        System.out.println(str1);
    }
}
