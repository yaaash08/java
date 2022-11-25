import java.util.*;
public class Function6 {
    public static void loop(int a){
        do{
          System.out.println(a);
          a++;
        }while(true);
      }
         public static void main(String []args){
           Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
       loop(a);
         }
}
