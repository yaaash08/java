import java.util.*;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word for n: ");
        int n = sc.nextInt();

        // for(int i =1; i <=20 ; i++){
        //     System.out.println(n + " * " + i + " = " + i*n);
        // }
        for(int i = 1; i<= 10; i++){
            System.out.println(i*n);
        }
    }
}
