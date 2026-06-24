public class marks extends student{
   
        double m_subject;
        double m_sports;
        double m_PT;
        marks(double subject,double sports,double PT)
        {
            super("virat","mumbai","9860215753");
            this.m_subject=subject;
            this.m_sports=sports;
            this.m_PT=PT;
    
        }
        void display1()
        {
            System.out.println("marks details");
            System.out.println(" subject marks="+m_subject);
            System.out.println("sports marks="+m_sports);
            System.out.println("PT marks="+m_PT); 
        }
        
        }
    
