// swap two numbers without using third variable
class Swap_num
{
    public static void swap(int a, int b)
    {
        System.out.println("Before swapping the number");
        System.out.println(a);
        System.out.println(b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping the number");
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args)
    {
        swap(10,20);
    }
}
