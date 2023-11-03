class DhiruBhai
{
    String company = "Reliance ltd.";
    public void SpeakingStyle()
    {
        System.out.println("I can talk");
    }

}
class Mukesh extends DhiruBhai
{

}
class Inheritance {
    public static void main(String[]args)
    {
        Mukesh ref = new Mukesh();
        System.out.println("Company name   : " + ref.company);
        ref.SpeakingStyle();
    }
}
