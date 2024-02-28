package staticmethods;
public class StaticMethods {

    public static void main(String[] args) {
        foo();
        foo();//In c/c++ we say functions,in JAVA ,we call them methods!
        bar();
        print("Hello");
        printSum(10,20);
        int x=printSum2(10,20);
        System.out.println(x);
        System.out.println(mult(10,20));
        System.out.println(mult(100,200));
    }
    
    static void foo()
    {
        System.out.println("Inside Foo");
    }
    static void bar()
    {
        System.out.println("Inside bar");
    }
    static void print(String str)
    {
        System.out.println(str);
    }
    static void printSum(int a,int b)
    {
        System.out.println(a+b);
    }
     static int printSum2(int a,int b)
    {
        return a+b;
    }
     static int mult(int a,int b)
    {
        return a*b;
    }
}
