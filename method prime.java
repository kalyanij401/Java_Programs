class method_prime {
    public static int prime()
    {
        int count1=0;
        for(int i=2;i<100;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                count1++;
            }
        }
        return count1;
    }
    public static void main(String[] args) {
        System.out.println("number of prime in the give range is: "+ prime());
    }
}
