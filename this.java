class A
{
    A(int a)
    {
        this();
        System.err.println("a(int)");
    }
    A(double a)
    {
        System.err.println("a(double)");

    }
    A()
    {
        this(12.12);
        System.err.println("a()");
    }
    public static void main(String[] args) {
        A obj=new A(100);
    }
}