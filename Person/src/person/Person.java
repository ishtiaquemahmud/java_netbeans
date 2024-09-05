/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author User
 */
public class Person {
   

    private int age;
    private String  name;
     public Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String age)
    {
       this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args) {
        Person p=new Person(23,"ishtiaque");
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
    
}

