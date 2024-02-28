
package ifelsestatements;

public class IfElseStatements {

    public static void main(String[] args) {
        int a=2000;
        int b=1000;
        int min;
        if(a<b)
        {
            System.out.println("a is less than b");
        }
        else
        {
            System.out.println("a is not less than b");
        }
        if(a<b)
        {
            min=a;
        }
        else
        {
            min=b;
        }
        System.out.println("The minimum of a and b is:" + min); //String Concatenation
       int p=100;
       int q=1000;
        if(p<q)
        {
            min=p;
        }
        else
        {
            min=q;
        }
        System.out.println("The minimum of p and q is:" + min); //String Concatenation
        
    }
         
    
}
