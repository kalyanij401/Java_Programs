class post_increment {
    public static void main(String[] args) {
        int a=27;
        {
        System.out.println(a++);//27
        int b=a++;//27
        System.out.println(a++);//29
        
        System.out.println(a);//30
        System.out.println(b++);//28

        System.out.println(b);//29
    }
    }
}

