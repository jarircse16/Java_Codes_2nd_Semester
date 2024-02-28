package whileloops;
public class WhileLoops {
    public static void main(String[] args) {
        int i=0;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        i=0;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        i=10;
        while(i<=20)
        {
            System.out.println(i);
            i++;
        }
        i=10;
        while(i>0)
        {
            System.out.println(i);
            i--;
        }
        
        int sum=0;
             i=1;
        while(i<1001)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
        
    }
    
}
