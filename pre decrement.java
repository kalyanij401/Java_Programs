class pre_decrement {
    public static void main(String[] args) {
        int a=27;
        {
        System.out.println(--a);//26
        int b=--a;//24
        System.out.println(--a);//24
        
        System.out.println(a);//24
        System.out.println(--b);//24

        System.out.println(b);//24
    }
    }
}
