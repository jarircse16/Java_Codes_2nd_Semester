
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
       Rectangle rect =new Rectangle (100,200);
       System.out.println(rect.getArea());
       Square square = new Square(100);//Inheritance
       System.out.println(square.getArea());//Inheritance
       Rectangle square2 = new Square(100);//Polymorphism:Even though an actual object is fixed one,you can use the type of the inherited class(Base Class) of that object for the variable..this is called polymorphism
       System.out.println(square.getArea());//Polymorphism:
       
    }
    
}
class Square extends Rectangle //inheritance
{
    public Square(int size)
    {
        super(size,size); //super constructor
    }   
}



class Rectangle //Base Class
{
    private int width;
    private int height;
    
    public Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    
    public  int getArea()
    {
        return width*height;
    }
}