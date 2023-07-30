class non_static 
{
    public void n_s_func()
    {
        System.out.println("Hi Everyone");
        System.out.println("this " + this);
        System.out.println("Bye Everyone");
    }
    public static void main(String[] args)
    {
        System.out.println("MB");
        non_static ref = new non_static();
        System.out.println("reference " + ref);
        ref.n_s_func();
        System.out.println("ME");
    }
    
}
