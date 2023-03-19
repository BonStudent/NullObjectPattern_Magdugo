/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

abstract class Emp
{
    protected String name;
    public abstract boolean isNull();
    public abstract String getName();
}
  
class Coder extends Emp
{
    public Coder(String name) 
    {
        this.name = name;
    }
    @Override
    public String getName() 
    {
        return name;
    }
    @Override
    public boolean isNull() 
    {
        return false;
    }
}
  
class NoClient extends Emp
{
    @Override
    public String getName() 
    {
        return "Not Available";
    }
  
    @Override
    public boolean isNull() 
    {
        return true;
    }
}
  
class EmpData 
{
      
    public static final String[] names = {"Juan", "Mary", "Leo"};
    public static Emp getClient(String name)
    {
        for (int i = 0; i < names.length; i++) 
        {
            if (names[i].equalsIgnoreCase(name))
            {
                return new Coder(name);
            }
        }
        return new NoClient();
    }
}
  
public class NullObjectPattern_Activity
{
    public static void main(String[] args) 
    {
        Emp emp1 = EmpData.getClient("Juan");
        Emp emp2 = EmpData.getClient("Mary");
        Emp emp3 = EmpData.getClient("Leo");
        Emp emp4 = EmpData.getClient("Melissa");
  
  
        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }
}
