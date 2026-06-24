 class opretor
{
 public static void main(String[] args)
  {
   int a=6,b=2;
   char ch='+';
   switch(ch)
   {
    case '+':
    {
        System.out.println("addition="+(a+b));
    }
    break;
    case '-':
    {
        System.out.println("subtracation="+(a-b));
    }
    break;
    case '*':
    {
        System.out.println("multipication="+(a*b));
    }
    break;
    case '/':
    {
        System.out.println("division="+(a/b));
    }
    break;
    case '%':
    {
        System.out.println("modulos="+(a%b));
    }
    break;
    default :
    {
        System.out.println("enter valid operator");
    }
   } 
  }   
}
