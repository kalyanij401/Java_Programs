 public class p14 {
         //     direct calling non ststic variable using non static method without argument.
    int a=10;
    public void demo()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        p14 obj=new p14();
        obj.demo();
    }    
}
