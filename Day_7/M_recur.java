class M_recur {
    public static void recur()
    {
        System.out.println("Hi Baby");
        recur();
        System.out.println("Bye baby");
    }

    public static void main(String[]args)
    {
        System.out.println("Main block starts");
        recur();                                           // stack overflow error 
        System.out.println("Main block Ends");
    }
    
}
