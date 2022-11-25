import java.util.*;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        while(n<=20){
            System.out.println(n+1);
            n++;
        }
    }
}

