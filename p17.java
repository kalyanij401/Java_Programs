public class p17 {
    static int a=10;// static variable
    //in static variable we use static keyword as a prefix
    int b=20;//nonstatic variable
    p17()
    {
        System.out.println("no argument constructor");//no argument constructor
    }
    public static void demo()//static method
    {
        System.out.println("a="+a);
    }
    public void demo1()//nonstatic method
    {
        System.out.println("b="+b);
    }
    {
        System.out.println("non static block 1");//non static block
    }
    static
    {
       System.out.println("static block 1");//static block
    }
    public static void main(String[] args)
    {
        p17 obj=new p17();//constructor calling
        obj.demo1();//nonstatic method call
        p17.demo();//static method call
    }
}
