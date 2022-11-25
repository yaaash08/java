import java.util.*;
public class Function7{
    public static void count(int input) {
        int positive = 0,negative = 0,zeroes = 0;
        System.out.println("Press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in); 
        input= sc.nextInt();
        while (input == 1) {
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            }else if(number <0){
    
                negative++;
            }else {
                zeroes++;
            }
            System.out.println("Press 1 to continue and 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeroes: " + zeroes);
    }
     public static void main(String []args){
    count(0);
     }
}