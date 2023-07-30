class small 
{
    public static int small_2(int a, int b)
    {
        if (a>b)
        {
            return b;
        }
        else
        {
            return a;
        }
    }
    public static int small_3(int a, int b,int c)
    {
        if ((a<b) && (a<c))
        {
            return a;
        }
        else if (b<a && b<c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static int small_4(int a, int b,int c,int d)
    {
        if (a<b && a<c && a<d)
        {
            return a;
        }
        else if (b<a && b<c && b<d)
        {
            return b;
        }
        else if (c<a && c<b && c<d)
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
        System.out.println(small_2(10,20));
        System.out.println(small_3(10, 20, 30));
        System.out.println(small_4(10,20,30 , 40));
    }
    
}
