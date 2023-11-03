package java.qspiders.Day_3;

class Calculator {
    // addition method 
    public static void add(int a, int b , int c , int d)  // parameterised method 
    {
        int e = a+b+c+d;
        System.out.println(e);
    }

    // substraction method
    public static void sub(int a , int b , int c , int d , int e)
    {
        int f = a-b-c-d-e;
        System.out.println(f);
    }


    // multiplication method
    public static void mul(int a , int b , int c , int d , int e, int f)
    {
        int g = a*b*c*d*e*f;
        System.out.println(g);
    }

    // Division method
    public static void div(int a , int b )
    {
        int f = a/b;
        System.out.println(f);
    }

    public static void main (String[]args)
    {
        add(10,20,30,40);
        sub(10,20,30,40,50);
        mul(10,20,30,40,50,60);
        div(120,20);
    
    }
    
}
