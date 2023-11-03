class Constructor
{
    Constructor()
    {
        // 1. PLI  --> pre loading instruction 
        // 2. IIB  --> Instance initialiser block
        // 3. UWS  --> user written statement 
        System.out.println("This is constructor");
    }
    // IIB  --> higher priority is given to iib whenever a constructor is being called 
    {
        System.out.println("This is instance initialiser block");
    }
    public static void main(String[] args)
    {
        Constructor ref = new Constructor();
    }

}