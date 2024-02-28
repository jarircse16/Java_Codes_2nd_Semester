
package methods;

public class Methods {

    public static void main(String[] args) {
        Rectangle rect=new Rectangle(100,200);
        System.out.println(rect.getWidth());
        System.out.println(rect.getHeight());
        System.out.println(rect.getArea());
        rect.setWidth(10);
        rect.setHeight(20);
        System.out.println(rect.getArea());
        rect.scale(10);
        System.out.println(rect.getArea());
    }
    
}

class Rectangle
{
    int width;
    int height;
    
    Rectangle(int width,int height)
{
    this.width=width;
    this.height=height;
}
    int getWidth()
    {
        return this.width;
    }
     int getHeight()
    {
        return this.height;
    }

     int getArea()
    {
        return this.height*this.width;
    }
     void setWidth(int width)
     {
         this.width=width;
     }
     void setHeight(int height)
     {
         this.height=height;
     }
     void scale(int factor)
     {
         width=width*factor;
         height=height*factor;
     }
}