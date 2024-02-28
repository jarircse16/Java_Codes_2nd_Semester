package calculator;
import java.util.Scanner; 
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers:");
        Scanner num1=new Scanner(System.in);
        int a=num1.nextInt();
        Scanner num2=new Scanner(System.in);
        int b=num2.nextInt();
        Engine2 calc=new Engine2();
        int add=calc.add(a, b);
        int sub=calc.subtract(a, b);
        int mul=calc.multiplication(a, b);
        float div=calc.divide(a,b);
        int rem=calc.remainder(a,b);
        System.out.println("The Results are here:");
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Division:"+div);
        System.out.println("Remainder:"+rem);
    }
}
class Engine2
{
    int x;
    int y;
    
    int add(int x,int y)
    {
        return x+y;
    }
    int subtract(int x,int y)
    {
        return x-y;
    }
    int multiplication(int x,int y)
    {
        return x*y;
    }
    float divide(int x ,int y)
    {
        return (float)x/(float)y;
    }
    
    int remainder(int x,int y)
    {
        return x%y;
    }
    
    
} 
