public class company {
    static String c_name="Infosys";
    public static void main(String[] args) 
    {
        emp obj=new emp("pihu","mumbai",70000.0);
        System.out.println("pihu is employee of ="+c_name);
        obj.display();
        obj.set_esal(80000);
        obj.display();
        System.out.println(obj.get_esal());
        System.out.println("name="+obj.e_name);
        obj.e_address="UP";
        System.out.println("address="+obj.e_address);
    }
}
