class Arun{
    void greet(){
       System.out.print("arun gamal"); 
    }
    void start(){
        System.out.print("engine started");
    }
}
class Sujan extends Arun{
    @Override
    void greet(){
        System.out.print("sujan pakhrin");
    }
}
public class MM{
    public static void main(String[] args){
        Arun a1=new Sujan();
        a1.greet();
        a1.start();
    }
}