public class customer{
    //to access first class member to second class  customer to cu_bank
    String a_name;
    String a_address;
    String mob_no;
    float acc_balance;
    customer(name,address,phone_no,balance)
    {
        this.a_name=name;
        this.a_address=address;
        this.mob_no=phone_no;
        this.acc_balance=balance;
    }
    void display()
    {
        System.out.println("name="+a_name);
        System.out.println("address="+a_address);
        System.out.println("phone no="+mob_no);
        System.out.println("acc_balance="+acc_balance);
    }
}
