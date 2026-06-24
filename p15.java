                   //directly callig non-static variable.
public class p15 {
    int a=10;
    p15()
    {
        System.out.println(a);//directly by variable name
        System.out.println(this.a);//by using this keyword
    }
    public static void main(String[] args) {
        p15 obj=new p15();
    }
}
