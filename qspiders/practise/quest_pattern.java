class quest_pattern {
    public static void pyramid(int a)
    {
        for (int i = 0 ;i < a ;i++)
        {
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args)
    {
        int a = 5;
        pyramid(a);
    }
    
}
