class continue_keyword {
    
        public static void main(String[] args) {
            int a=0;
            while(a<4)//0<4t..1<4t..2<4t
            {
                System.out.println(a);
                if(a==1)
                {
                    System.out.println("if block");
                    a++;
                    continue;
                }
                System.out.println(a);//0.2
                a++;//1..3
            }
        }
     
}
