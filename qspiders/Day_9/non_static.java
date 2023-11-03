class non_static
{
    //non-static method
    /*
    {
        System.out.println("Congratulations you have successfully created a new account");
    }  

    */
    // multiple uses of non-static method
    {
        System.out.println("Congratulations you have successfully created a new account");
    }    
    public static void main(String[]args)
    {
        non_static ref1 = new non_static();                          //Congratulations you have successfully created a new account
        non_static ref2 = new non_static();                          //Congratulations you have successfully created a new account
        non_static ref3 = new non_static();                          //Congratulations you have successfully created a new account
        non_static ref4 = new non_static();                          //Congratulations you have successfully created a new account  
        non_static ref5 = new non_static();                          //Congratulations you have successfully created a new account
    }
    /*
        //static method
    static
    {
        System.out.println("Congratulations you have successfully created a new account");
    }
    public static void main(String[]args)
    {
        non_static ref1 = new non_static();                          //Congratulations you have successfully created a new account
        non_static ref2 = new non_static();                          //Congratulations you have successfully created a new account
        non_static ref3 = new non_static();                          //Congratulations you have successfully created a new account
        non_static ref4 = new non_static();                          //Congratulations you have successfully created a new account  
        non_static ref5 = new non_static();                          //Congratulations you have successfully created a new account
    }
    */
}