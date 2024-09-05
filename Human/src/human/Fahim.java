
package human;


public class Fahim extends Human {
    public  void name()
    {
        System.out.println("His name is Ishtiaque");
    }
    public void eat(){
        System.out.println("Nowadays he only eats murgi");
    
}
    public void sleep()
    {
        System.out.println("he sleeps when necessary");
        
    }
    public void like()
    {
        System.out.println("he likes playing games");
    }
    public static void main(String[] args) {
        Fahim p=new Fahim();
        p.name();
        p.eat();
        System.out.println("just to let you know that i can spell chicken so don't think i wrote murgi because i can't spell chicken");
        p.sleep();
        p.like();
        p.read();
        
    
        
    }
}
