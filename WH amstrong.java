class amstrong{
    public static void main(String[] args)
    {
        int n=371,sum=0,temp=n;
        while(n>0)
        {
            int rem=n%10;
            int pow=rem*rem*rem;
            sum=sum+pow;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+" is armstrong no");
        }
        else{
            System.out.println(temp+" is not armstrong no");
        }
    }
}