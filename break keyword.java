class using_break {
    public static void main(String[] args) {
        int a=0;
        while(a<4)//0<4t..1<4t
        {
            System.out.println(a);
            if(a==1)//0==1f..1==1t
            {
                System.out.println("if block");
                break;
            }
            System.out.println(a);//10
            a++;//1
        }
    }
}
