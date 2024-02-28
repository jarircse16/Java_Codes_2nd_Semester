
package ifstatements;

public class IfStatements {

    public static void main(String[] args) {
        int i=5;
        if(i<10) //If statement
        {
            System.out.println("i is less than 10");
        }
        if(i>0) //If statement
        {
            System.out.println("i is greater than 0");
        }
        i=100;
        if(i<10) //If statement //False statements doesn't execute...Only true statements execute..
        {
            System.out.println("i is less than 10");
        }
        if(i>0) //If statement
        {
            System.out.println("i is greater than 0");
        }
        if(i%2==0)
        {
            System.out.println("i is even");
        }
        
    }
    
}
