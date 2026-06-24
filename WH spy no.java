class spy{
   public static void main(String[] args)
   {
    int n=1234, sum=0, mul=1, temp=n;
    while(n>0)
    {
        int rem=n%10;
        sum=sum+rem;
        mul=mul*rem;
        n=n/10;
    }
    if(sum==mul)
    {
        System.out.println(temp+" no is spy");
    }
    else{
        System.out.println(temp+" no is not spy");
    }
   }
}
