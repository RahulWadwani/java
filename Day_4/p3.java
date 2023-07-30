class p3 
{

    //1st method 
    public static int add_2(int a,int b)                         // addition of 2 numbers 
    {
        int c  = a+b;
        return c;   
    }

    //2nd method 
    public static int add_3(int a,int b,int c)                     // addition of 3 numbers
    {
        int d = a+b+c;
        return d;   
    }

    //3rd method
    public static int add_4(int a,int b,int c, int d)               // addition of 4 numbers
    {
        int e = a+b+c+d;
        return e;   
    }

    //4th method
    public static int add_5(int a,int b,int c, int d ,int e)       // addition of 5 numbers
    {
        int f = a+b+c+d+e;
        return f;   
    }

    //5th method 
    public static int add_6(int a,int b,int c, int d , int e, int f)  // addition of 6 numbers 
    {
        int g = a+b+c+d+e+f;
        return g;   
    }


    public static void main(String[] args)
    {
        System.out.println("Sum of 2 numbers is " + add_2(10,20));
        System.out.println("Sum of 3 numbers is " + add_3(10,20,30));
        System.out.println("Sum of 4 numbers is " + add_4(10,20,30,40));
        System.out.println("Sum of 5 numbers is " + add_5(10,20,30,40,50));
        System.out.println("Sum of 6 numbers is " + add_6(10,20,30,40,50,60));
    }
    
}
