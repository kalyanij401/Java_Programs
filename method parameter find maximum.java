class method_parameter_maximum {
    public static int max(int a,int b,int c){
        
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
        System.out.println("maximum number is="+max(30,76,15));
    }
}
