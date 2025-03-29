class Student{  // default specificier - package level
	// data members
    int sid; // instance - object - Heap
    String sname; // instance
    double gpa; // instance
    static String university = "Stanford"; // class - Class Area

	// methods - setter & getter 
    public void setStudent(int id, String name, double avg){  // local variables - Stack
    	sid = id;
    	sname = name;
        gpa = avg;
    }
    public void getStudent(){
    	System.out.println(sid+"  "+sname+"  "+gpa+"  "+university);
    }

    public static void main(String[] args) {
	Student s1 = new Student();  // creating an object - Student
	s1.setStudent(123,"ABC", 8.9);
	s1.getStudent();

	Student s2 = new Student();  // creating an object - Student
	s2.setStudent(111,"XYZ", 8.3);
	s2.getStudent();


}

}

// Heap - objects -
// Class Area / Method Area
// Stack Area  - local