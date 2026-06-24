public class flower {
        String F_name;
        String F_shape;
        String F_type;
        flower(String name,String shape,String type)
        {
                this.F_name=name;
                this.F_shape=shape;
                this.F_type=type;
        }
        void display1()
        {
                System.out.println("flower details");
                System.out.println("flower name="+F_name);
                System.out.println("flower shape="+F_shape);
                System.out.println("flower type="+F_type);
        }
}