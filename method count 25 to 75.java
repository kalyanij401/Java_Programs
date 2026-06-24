class count_25$75{
    public static int count()
    {
        int counter1=0;
        for(int i=25;i<=75;i++)
        {
          if(i%2==0)
        {
             counter1++;
        }
    
        }
        return counter1++;
    }
      public static void main(String[] args) {
        System.out.println(" even number between 25 to 75:"+count());
      }
}