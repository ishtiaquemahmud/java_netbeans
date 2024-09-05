
package javaapplication4;
import java.util.Scanner;


public class JavaApplication4 {
    
    public void maxvalue(int a,int b){
        if(a>b){
            System.out.println("maxvalue is : "+a);
        }
        else{ 
            System.out.println("maxvalue is : "+b);
        }
    }
    public void maxvalue(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("maxvalue is : "+a);
        }
        else if(b>a && b>c){
            System.out.println("maxvalue is : "+b);
        }
        else{
            System.out.println("maxvalue is : "+c);
        }
    }
    public void maxvalue(double a,double b){
        
      if(a>b){
            System.out.println("maxvalue is : "+a);
        }
        else{ 
            System.out.println("maxvalue is : "+b);
        }
      
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("put two integer number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        
        System.out.println("put three integer number");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        
        
        System.out.println("put two double number");
        double f=sc.nextDouble();
        double g=sc.nextDouble();
        
        JavaApplication4 p=new JavaApplication4();
        p.maxvalue(a, b);
        p.maxvalue(c, d, e);
        p.maxvalue(f, g);
        
    }
}

    