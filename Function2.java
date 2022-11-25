import java.util.*;
public class Function2{
    public static void printSum( int n) {
        int m = 0;
       for(int i =1 ; i <=n ;i++){
        if(i % 2 == 1){
            m = m +i;
        }
       }
       System.out.println(m);
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printSum(n);
 }
}