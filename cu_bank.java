public class cu_bank {
    
    public static void main(String[] args) {
        System.out.println("first customer details");
        customer obj=new customer("avirbhav", "mumai", "947674944", 70000f);
        obj.display(); 
        System.out.println("second customer details");
        customer obj1=new customer("pihu", "mumai", "948247749", 60000f);
        obj1.display();  
    } 
}
