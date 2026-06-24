public class WH_count_even{
    public static void main(String[] args) {
     int n=1,count=0;
     {
        while(n<=100)
        {
            if(n%2==0)
            {
                count++;
            }
            n++;
        }
        System.out.println("count is="+count);
     }
    }
}
