class p12
{

   static int a=10;  //static variable
   
	public static void demo()   //static method
   {
    System.out.println(a);
    
   }
	
	static    //static block
   {              
      System.out.println(p12.a);
      p12.demo();
   }
   
   public static void main(String[] args) {
    System.out.println(a);
   }
}