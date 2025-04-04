public class Cnst{
    String name;
    int age;
    double gpa;
    static String university="jmc";
    public Cnst(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
public void display(){
    System.out.println("Name: " + name + " Age: " + age + " GPA: " + gpa + " university: " + university);
}
    public static void main(String[] args) {
        Cnst student = new Cnst("arun",20,4.0);
        student.display();
        Cnst s1 = new Cnst("sujan",20,3.0);
        s1.display();
    }
}

