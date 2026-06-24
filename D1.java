 /**
  * D1
  */
 public class D1 {
 
    D1()
    {
        super();
        System.out.println("no argument constructor");
    }
    D1(int a)
    {
        this();
        System.out.println("a="+a);
    }
    D1(double d)
    {
        this(40);
        System.out.println("d="+d);
    }
    public static void main(String[] args) {
        D1 obj=new D1(4.9);
    }
 }