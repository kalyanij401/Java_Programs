class post_decrement {
    public static void main(String[] args) {
        int a=27;
        {
        System.out.println(a--);//27
        int b=a--;//26
        System.out.println(a--);//25
        
        System.out.println(a);//24
        System.out.println(b--);//26

        System.out.println(b);//25
    }
    }
}

