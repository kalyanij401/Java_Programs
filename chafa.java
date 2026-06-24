public class chafa extends flower {
    String c_colour;
    String c_fregrance;
    double c_prize;
    chafa(String colour,String fregrance,double prize)
    {
        super("chafa","star","small");
        this.c_colour=colour;
        this.c_fregrance=fregrance;
        this.c_prize=prize;

    }
    void display()
    {
        System.out.println("chafa details");
        System.out.println("chafa colour="+c_colour);
        System.out.println("chafa fregrance="+c_fregrance);
        System.out.println("chafa prize="+c_prize); 
    }
    public static void main(String[] args) {
        chafa obj=new chafa("white","ultimate",120.5);
        obj.display1();
        System.out.println();
        obj.display();
    }
}
