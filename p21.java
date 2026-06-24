public class p21 {
    //can we initionalize static variable from static method
    //static variable from static method
     static int a;
     public static void demo1()
     {
        a=50;
        System.out.println("non static method a="+a);
        System.out.println(p21.a);
     }
     public static void main(String[] args) {
        p21.demo1();
     }
}
