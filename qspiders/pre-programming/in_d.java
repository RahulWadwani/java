class in_d 
{
    public static void main(String[]args)
    {
        int a =  14;
        int b = ++a - 2;
        int c = ++a + ++b + b++;
        int d =  ++b + b++ - c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
