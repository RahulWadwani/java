class Chaining
{
    // defining the global variable 
    int a;
    int b;
    int c; 
    int d;


    // 1st constructor 
    Chaining() // no argument constructor  constructor 
    {
        System.out.println("This is first constructor having no arguments");
    }

    //2nd constructor 
    Chaining(int a ) // 1 formal argument constructor  constructor 
    {
        this();                                                 // this calling statement 
        this.a = a;
        System.out.println(this.a);
        System.out.println("This is Second constructor having 1 arguments");
    }

    // 3rd constructor 
    Chaining(int a, int b) // 2 argument constructor  constructor 
    {
        this(a);                                                 // this calling statement 
        this.a = a;
        this.b = b;
        System.out.println(this.a + " " +this.b);
        System.out.println("This is Third constructor having 2 arguments");
    }

    //4th constructor 
    Chaining(int a, int b, int c) // 3 argument constructor  constructor 
    {
        this(a,b);                                                 // this calling statement 
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(this.a + " " + this.b + " " + this.c);
        System.out.println("This is fourth constructor having 3 arguments");
    }

    // 5th constructor 
    Chaining(int a , int b ,int c,int d) // 4 argument constructor  constructor 
    {
        this(a,b,c);                                                 // this calling statement 
        this.a = a;                                                  // this is how we call a global variable 
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println(this.a + " " + this.b + " " + this.c + " " + this.d); 
        System.out.println("This is fifth constructor having 4 arguments");
    }
    
    public static void main(String[] args)
    {
        Chaining ref = new Chaining(100, 20, 30,40);      // object calling 
    }
}