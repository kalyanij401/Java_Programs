import javax.swing.event.SwingPropertyChangeSupport;

class even_count {
    public static void main(String[] args) {
       int count=0;
        for(int i=75;i<=125;i++)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        System.out.println("count is="+count);
    }
}
