class method_maximum {
    public static int max(){
        int a=3,b=5,c=8;
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("maximum number is="+max());
    }
}
