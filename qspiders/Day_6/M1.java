// method overloading 
// calculator
class M1 {
    // method overloading means global area containing more than one methods 
    public static int add(int a , int b)
    {
        return a+b; 
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static int add(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }
    public static void main(String[] args)
    {
        System.out.println("Addition of 2 numbers " + add(10,20));
        System.out.println("Addition of 3 numbers " + add(10,20,30));
        System.out.println("Addition of 4 numbers " + add(10,20,30,40));
    }
    
}
