public class I2 extends I1 {
   
        static int b=20;
static
{
    System.out.println("static block 2");
}
   public static void main(String[] args) {
    demo();
    System.out.println("a="+a);
    
    System.out.println("b="+b);
   }
}
