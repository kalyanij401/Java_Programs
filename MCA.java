public class MCA extends computerD {
    int G_OOP;
    int G_SE;
    int G_DMS;
    MCA(int OOP,int SE,int DMS)
    {   
        super(350,200,180);
        this.G_OOP=OOP;
        this.G_SE=SE;
        this.G_DMS=DMS;
    }
    void display2()
    {
        System.out.println("computer department MCA");
        System.out.println("OOP student="+G_OOP);
        System.out.println("SE student="+G_SE);
        System.out.println("DMS student="+G_DMS);
    }
    public static void main(String[] args) {
        MCA obj=new MCA(98,88,95);
        obj.display();
        System.out.println();
        obj.display1();
        System.out.println();
        obj.display2();
       
       


    }
}
