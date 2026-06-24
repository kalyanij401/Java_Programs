public class p16 {
                       //non static variable calling in 2 ways
    int a=10;
    p16()
     { /* to access non_static variable inside constructor we use two ways
           1).directly by variable name
           2).using this keyword
         */
        int a=30;
        System.out.println(a);//directly by variable name
        System.out.println(this.a);//by using this keyword
    }
    public static void main(String[] args) {
        p16 obj=new p16();
    }
}

