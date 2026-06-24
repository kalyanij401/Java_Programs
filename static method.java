class p4{
    
    public static void demo()
    {
        System.out.println("demo()");
    }
    public static void main(String[] args) {
        {
            demo();//directly by method name
            p4.demo();//clas name as a refference
        }
    }
}
 