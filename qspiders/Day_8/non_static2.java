class non_static2 
{
    static int i=10;
    public void add()
    {
        System.out.println("Directly "+i);
        System.out.println("this "+this.i);
        System.out.println("class name"+non_static2.i);

    }
    public static void main(String[] args)
    {
        non_static2 ref = new non_static2();
        ref.add();
    }
    
}
