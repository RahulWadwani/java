/*
class Multiplication
{
    public static void mul()               // no argument 
    {
        int a = 10;
        int b = 20;
        int c = a*b;
        System.out.println(c);
    }
    public static void main (String[] args)
    {
        mul();                                     
    }
    
} 
*/


//

class Two_method
{
    public static void add()                     // called method
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
    public static void mul()                       // called method 
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int d  = a*b*c;
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        //method calling 
        System.out.print("The addition of two number is      : ");
        add();
        System.out.print("Multiplication of Three number is  : ");
        mul();
    }
}