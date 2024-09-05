/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;
import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
{
System.out.printf("1");
int sum = 9 / 0;
System.out.printf("2");
}
catch(ArithmeticException e)
{
System.out.printf("3");
}
catch(Exception e)
{
System.out.printf("4");
}
finally
{
System.out.printf("5");
}

}
}
