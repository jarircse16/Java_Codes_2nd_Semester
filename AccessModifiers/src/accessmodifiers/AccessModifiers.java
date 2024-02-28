
package accessmodifiers;

public class AccessModifiers {

    public static void main(String[] args) {
        Rectangle rect =new Rectangle(100,200);
        System.out.println(rect.getHeight());
         System.out.println(rect.getWidth());
        //System.out.println(rect.height); //wont work when height is private
        //System.out.println(rect.width); //wont work when height is private
    }
    
}
class Rectangle
{
    int width;
    private  int height;
    Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    public int getHeight()
    {
        return this.height; //data encapsulation...only getheight function can access the height field..thats why it is encapsulated..
    }

     public int getWidth()
    {
        return this.width; //data encapsulation...only getheight function can access the height field..thats why it is encapsulated..
    }
}