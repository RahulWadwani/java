// print gcd of 2 numbers 
class quest_51 {
    public static int gcd(int a, int b){
        if (a==b)
            return a;
        else if (a>b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);

    }
    public static void main(String[] args)
    {
        gcd(45,90);

    }
    
    
}
