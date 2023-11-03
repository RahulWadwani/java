class Sum_even
{
    // using method recursion 
    public static int even()
    {
        for (int i = 0; i <=10; i ++)
            if (i%2 == 0)
                return i;
    }
    public static void main (String[] args)
    {
        even();
    }
}