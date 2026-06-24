class pre_increment
{
    public static void main(String[] args) {
        int a=27;
        {
        System.out.println(++a);//28
        int b=++a;//29
        System.out.println(++a);//30
        System.out.println(a);//30
        System.out.println(++b);//30    
        System.out.println(b);//30
    }
    }
}