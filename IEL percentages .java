import java.util.Scanner;
class percentages
{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the percentage: ");
   int per=sc.nextInt();
   sc.nextLine();
   // int per=78;
    if(per>=90)
    {

        System.out.println(" distinction ");
    }
     else if(per>=70 && per<90)
    {
        System.out.println("frist class");    
    }
    else if(per>=50 && per<70)
   {
        System.out.println("second class");
   }
   else if(per>=40 && per<50)
   {
        System.out.println("third class");
   }
   else
   {
        System.out.println("failed");
   }
   
 }
}
