 class method_sum {
    public static int sum(int n) {
        
        if(n<=1)
        {
          return 1;
        }
        else{
           return n+sum(n-1);//10+9+8...
        }
       
    }
    public static void main(String[] args) {
        int add=sum(10);
        System.out.println("addition="+add);
    }
}
