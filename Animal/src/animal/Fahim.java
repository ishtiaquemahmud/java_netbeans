
package animal;

public class Fahim implements Animal{
    public void eat()
    {
        System.out.println("rice");
    }
    public void sleep ()
    {
        System.out.println("10 pm");
    }
    
    public void varsity()
    {
        System.out.println("8");
    }
    public static void main(String[] args) {
        Fahim p=new Fahim();
        p.eat();
        p.sleep();
        p.varsity();
        
    }
}
