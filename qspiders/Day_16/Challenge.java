class Parent
{
    int a = 5;              //state
    private double val = 50.0;
    public void inherit()   //behaviour
    {
        System.out.println("Hi I am a parent class ");
    }
}

public double getVal()
{
    return val;
}

public void setVal(double val)
{
    this.val = val;
}

class Child extends Parent{
}


class Challenge
{
    public static void main(String[]args)
    {
        Child ref = new Child();
        System.out.println(ref.a);
        ref.inherit();
        Parent ref1 = new Parent();
        System.out.println(ref1.getVal());
        
    }    
}
