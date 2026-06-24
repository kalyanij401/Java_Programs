public class student {
        String s_name;
        String s_address;
        String s_phoneno;
        student(String name,String address,String phoneno)
        {
                this.s_name=name;
                this.s_address=address;
                this.s_phoneno=phoneno;
        }
        void display()
        {
                System.out.println("student details");
                System.out.println("student name="+s_name);
                System.out.println("student address="+s_address);
                System.out.println("student phoneno="+s_phoneno);
        }
}
