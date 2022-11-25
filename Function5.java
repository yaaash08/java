import java.util.*;
public class Function5{
  public static int age(int a){
    if(a > 18){
        System.out.println("Eligible");
    }else{
        System.out.println("Not eligible");
    }
    return 0;
  }
     public static void main(String []args){
       Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
   age(a);
     }
}