/*

// my first program in qspiders 

class P1 
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");
    }
}
*/

// global and local variable 

/*
class P2
{
    // class block 
    public static void main(String[] args)
    {
        // main block 
        int a = 10;                                    // local variable 
        System.out.println(a);
    }
}
*/

// Errors 
/*
// compile time error (CTE)

class P3
{
    public static void main(String[] args)
    {
        int a = 25;
        int a = 55;                                // p1.java:36: error: variable a is already defined in method main(String[])
        System.out.println(a);     
    }
}
*/

//compile time error (CTE)
/*
class p4 
{
    public static void main(String[] args)
    {
        int a;
        System.out.println(a);                    // p1.java:50: error: variable a might not have been initialized
    }
}
*/

/*
class p5
{
    public static void main(String[] args)
    {
        int a = 10;             
    }
    System.out.println(a);                         // p1.java:63: error: <identifier> expected
}
*/