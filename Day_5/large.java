class large 
{
    public static int large_2(int a, int b)
    {
        if (a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static int large_3(int a, int b,int c)
    {
        if ((a>b) && (a>c))
        {
            return a;
        }
        else if (b>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static int large_4(int a, int b,int c,int d)
    {
        if (a>b && a>c && a>d)
        {
            return a;
        }
        else if (b>a && b>c && b>d)
        {
            return b;
        }
        else if (c>a && c>b && c>d)
        {
            return c;
        } 
        else
        {
            return d;
        }
    }
    
    
    public static void main(String[] args)
    {
        System.out.println(large_2(10,20));
        System.out.println(large_3(10, 20, 30));
        System.out.println(large_4(10,20,30 , 40));
    }
    
}
