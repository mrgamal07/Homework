class Student{
    int sid;
    String sname;
    double gpa;
    static String university= "jmc";

public Student( int id,String name,double avg){
    sid=id;
    sname=name;
    gpa=avg;
}
public void display(){
    System.out.println(sid+" "+sname+" "+gpa+" "+university);
}
public static void main(String[] args){
    Student s1=new Student(100,"arun",4.0);
    s1.display();
    Student s2=new Student(200,"sujan",4.0);
    s2.display();
}
}