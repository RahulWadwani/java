//write a java program to print numbers from 1 to 10 without loops 
class one_10 
{
    public static int recur(int a)
    {
        if (a>0)
        {
            recur(a-1);
            System.out.println(a + " ");
        }
        return a ;
    }
    
    public static void main(String[] args)
    {
        recur(100);
    }
}