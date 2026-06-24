public class emp {
    //incapsulation
    String e_name;
    String e_address;
    private float esal;
    emp(String name,String address,float salary)
    {
        this.e_name=name;
        this.e_address=address;
        this.esal=salary;
    }
    public float get_esal()
   {
       return esal;    
   }
   public void set_esal(float salary)
   {
    this.esal=salary;
   }
   void display()
   {
    System.out.println("name="+e_name+" "+"address="+e_address+" "+"salary="+esal);
   }
}
