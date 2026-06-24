class static_method_from_static_block {
 
   //calling static method from static block(multiple)
   static int a=10;//static variable
   static int b=56;
   static
   {              //static block
      a=12;
      demo();
   }
   static 
   {
    b=16;         //static bolck
    demo();
   }
   public static void demo()
   {
    System.out.println(a);
    System.out.println(b);
   }
   public static void main(String[] args) {
    
   }
}
