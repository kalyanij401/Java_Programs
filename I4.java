public class I4 extends I3 {
   //non satic
     int b=80;
{
    System.out.println("static block 2");
}
   public static void main(String[] args) {
    I4 obj=new I4();
    obj.demo();
    System.out.println("a="+obj.a);
    System.out.println("b="+obj.b);
   }


}
