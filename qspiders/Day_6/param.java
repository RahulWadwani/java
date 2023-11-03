// concept of widening is used meaning if a char is converted into int then to long then to float then into double depending upon the size 
class param {
    public static void test(double a)
    {
        System.out.println("DOUBLE");
    }
    public static void test(float a)
    {
        System.out.println("FLOAT");
    }


    public static void main(String[]args)
    {
        test('c');                               // returns float
    }
    
}
