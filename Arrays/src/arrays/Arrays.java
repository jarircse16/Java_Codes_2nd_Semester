
package arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] a = { 4,8,2 };
        System.out.println(a[0]);
         System.out.println(a[1]);
         for(int i=0; i<a.length; i++)
         {
             System.out.println(a[i]);
         }
         int[]b=new int[4];
         System.out.println(b[0]);
         b[0]=5;
         System.out.println(b[0]);
         b[1]=7;
         System.out.println(b[1]);
    }
    
}
