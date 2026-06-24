public class sports extends marks {
        String p_cricket;
        String p_badminton;
        String p_hockey;
        sports(String cricket,String badminton,String hockey)
        {    
   
            super(78.50,75.70,85.9);
            this.p_cricket=cricket;
            this.p_badminton=badminton;
            this.p_hockey=hockey;
    
        }
        void display2()
        {
            System.out.println("sports details");
            System.out.println("cricket game="+p_cricket);
            System.out.println("badminton game="+p_badminton);
            System.out.println("hocky game="+p_hockey); 
        }
        public static void main(String[] args) {
            sports obj=new sports("4 trophy","2 medals","15 goals");
            obj.display();
            System.out.println();
            obj.display1();
            System.out.println();
            obj.display2();

}

}