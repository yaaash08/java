import java.util.*;
public class StringsQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];

        int totlength = 0;

        for(int i = 0;i<size ; i++){
            array[i] = sc.nextLine();

            totlength = totlength + array[i].length();
        }
        System.out.println(totlength);
    }
}
