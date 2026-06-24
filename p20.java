public class p20 {
    //initiallize non static variable form non static method both ways
    int a;
    public void demo1()
    {
        a=50;
        System.out.println("a="+a);
        this.a=98;
        System.out.println("a="+a);
    }
    public static void main(String[] args) {
        {
            p20 obj=new p20();
            obj.demo1();
        }
    }
}
