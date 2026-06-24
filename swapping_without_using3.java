class swapping_without_using3 {
    public static void main(String[] args) {
        int a=16,b=9;
        System.out.println("values before swapping");
        System.out.println("a="+a+" "+"b="+b);
        a=a+b;//25
        b=a-b;//16
        a=a-b;//9
        System.out.println("values after swapping");
        System.out.println("a="+a+" "+"b="+b);
    }
}
