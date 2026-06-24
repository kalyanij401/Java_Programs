 class Strong {
    public static void main(String[] args)
    {
        int n=145,sum=0,temp=n;
        while(n>0)
        {
            int rem=n%10;
            int fact=1;
        for(int i=rem;i>=1;i--)
        {
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
    }   
    if(temp==sum)
    {
        System.out.println(temp+ " is strong no");
    }
    else
    {
        System.out.println(temp+ " is not strong no");
    }
  }
}
