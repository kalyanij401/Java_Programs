class Palindrome
 {
    public static void main(String[] args)
    {
        int n=121,rev=0,temp=n;
        while(n>0)
        {
            int rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("no is palindrome ");
        }
        else
        {
            System.out.println("no is not a palindrome");
        }
    }
    
}
