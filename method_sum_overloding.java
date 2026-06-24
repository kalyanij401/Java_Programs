class method_sum_overloding {
    public static void sum()
    {
       int a=4,b=5;
       System.out.println("addition="+(a+b));
    } 
    public static void sum(int a,int b)
    {
       System.out.println("addition="+(a+b));  
    }
    public static void sum(int a,int b,int c)
    {
       System.out.println("addition="+(a+b+c));
    }
    public static void sum(int a,float b)
    {
       System.out.println("addition="+(a+b));
    }
    public static void sum(float a,float b)
    {
       System.out.println("addition="+(a+b));
    }
    public static void sum(char ch,char ch1)
    {
       System.out.println("addition="+(ch+ch1));
    }
    public static void main(String[] args) {
       sum();
       sum(4,7);
       sum(4,7,9);
       sum(4,3.6f);
       sum(8.6f,9.2f);
       sum('k','j');
    }
   }