class method_factorial {
    public static int factorial(int n) {
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;//6*5=30*4=120*3=360*2=720*1=720
        }
        return fact;
    }
    public static void main(String[] args) {
        int fact=factorial(6);
        System.out.println("factorial="+fact);
    }
}
