class pc1 {
    int a;
    int b;
    //parametarize constructor
    pc1(int x,int y)
    {
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        pc1 obj=new pc1(6,7);
        System.out.println(obj);
        System.out.println(obj.a);
        System.out.println(obj.b);        
    }
}
