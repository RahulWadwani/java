class Capgemini{
    int id;
    String name;
    private double sal;
    Capgemini(int id, String name,double sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;        
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal){
        this.sal = sal;
    }
}
class Employee{
    public static void main(String[]args)
    {
        Capgemini ref1 = new Capgemini(12345, "Rahul",10000000);
        ref1.setSal(100000000);
        Capgemini ref2 = new Capgemini(12346, "Rukmini",1000000);
        ref2.setSal(20000000);
        System.out.println("=====================EMP1=============================");
        System.out.println(ref1.id);
        System.out.println(ref1.name);
        System.out.println(ref1.getSal());
        System.out.println("=====================EMP2=============================");
        System.out.println(ref2.id);
        System.out.println(ref2.name);
        System.out.println(ref2.getSal());

    }

}