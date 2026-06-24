class method_fact2 {

        public static int fact(int n) {
            if(n<=1)//4<=1f...3<=1f
            {
                return 1;
            }
            else{
                return n*fact(n-1);//4*fact(3);
            }
        }
        public static void main(String[] args) {
            int factorial=fact(6);
            System.out.println("factorial="+factorial);
        }
    }
    

