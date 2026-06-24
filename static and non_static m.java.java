                          //static vs non-static meyhod
class sns5 {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        sns5 obj=new sns5();
        obj.disp();
        sns5.show();
    }
     static  void show()
    {
        System.out.println("show:"+b);
    }
    void disp()
    {
        System.out.println("disk:"+a+" "+b); 
    }
}




/*
 static method have static keyword as a prefix



 non-static does not hava static keyword.
 */
