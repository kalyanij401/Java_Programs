public class computerD {
    
     int C_BCS;
     int C_BCA;
     int C_BBA;
     computerD(int BCS,int BCA,int BBA)
     {
        this.C_BCS=BCS;
        this.C_BCA=BCA;
        this.C_BBA=BBA;
     }
     void display()
     {
        System.out.println("computer department");
        System.out.println("BCS student="+C_BCS);
        System.out.println("BCA student="+C_BCA);
        System.out.println("BBA student="+C_BBA);
     }
      
}
