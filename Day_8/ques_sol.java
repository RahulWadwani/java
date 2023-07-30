class ques_sol {
    int a = 10;                                      // global non static variable
    int b = 20;                                      // global non static variable
    static int c = 30;                               // global static variable

    public void exp()                                // non static  
    {
        System.out.println(a);
        System.out.println(b);
        ques_sol ref = new ques_sol();
        System.out.println(ref.c);

    }
    
    public static void main (String[] args)          // static
    {
        // static calling 
        System.out.println("--Static method--");
        ques_sol ref1 = new ques_sol();
        System.out.println(ref1.a);
        ques_sol ref2 = new ques_sol();
        System.out.println(ref2.b);
        System.out.println(c);
        
        //non static method calling
        System.out.println("--Non-static method--");
        ques_sol ref3 = new ques_sol();
        ref3.exp();
    }
    
}
