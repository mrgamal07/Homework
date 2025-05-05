class Arun{
    void greet(){
       System.out.print("arun gamal\n"); 
    }
    void start(){
        System.out.print("engine started\n");
    }
}
class Sujan extends Arun{
    @Override
    void greet(){
        System.out.print("sujan pakhrin\n");
    }
}
public class MM{
    public static void main(String[] args){
        Arun a1=new Sujan();
        Arun b2 = new Arun();
        b2.greet();
        a1.greet();
        a1.start();
    }
}