class method_posi_nega_conditional_op {
    public static String ispositive(int a){

        String res=(a>=0)?"no is positive":"no is negative";
        return res;
    }
    public static void main(String[] args) {
        String res=ispositive(-8);
        System.out.println(res); 
  }
}

