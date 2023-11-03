//guess the output
public class Test {
    public static void main(String[] args){
        try{
            throw new IOException("Hello");

        }
        catch(IOException | Exception e){
            System.out.println(e.gotMessage());
        }
    }
}