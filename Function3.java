import java.util.*;
public class Function3{
    public static int printGreat(int n, int m) {
        if(n>m){
            System.out.println(n);
        }else{
            System.out.println(m);
        }
        return 0;
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    printGreat(n,m);
 }
}