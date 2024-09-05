
package bo;
import java.util.Scanner;


public class Bo {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("pleasse put three integer numbers");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
       int Max =Math.max(Math.max(a,b),c); 
        int Min =Math.min(Math.min(a,b),c); 
        
    System.out.println("the maximum value is  :  "+Max);
    System.out.println("the minimum value is  :  "+Min);
    }
    
}
