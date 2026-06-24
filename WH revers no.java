 class  Revers
  {
   public static void main(String[] args)
   {
    int n=1234,rev=0;
    while(n>0)
    {
        int rem=n%10;
        rev=rem+rev*10;
        n=n/10;
    }
    System.out.println(rev);
  }

} 

