 class binary_operator6 {
    public static void main(String[] args) {
        int a=4,b=7,c=9,d=8;
        System.out.println((a>b)&&(c<d));//false&&false
        System.out.println((a>b)&&(c>d));//false&&true
        System.out.println((a<b)&&(c<d));//true&&false
        System.out.println((a<b)&&(c>d));//true&&true
    }
}
