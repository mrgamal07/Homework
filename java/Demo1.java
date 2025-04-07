class Person {
    // Hidden part (private): internal data
    private String name;
    private int age;

    // Constructor (public): exposed to set initial values
    public Person(String name, int age) {
        this.name = name;
        setAge(age);  // Use setter to control age setting
    }

    // Public method (exposed): to access name
    public String getName() {
        return name;
    }

    // Public method (exposed): to access age
    public int getAge() {
        return age;
    }

    // Private method (hidden): used only inside the class to validate and set age
    private void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
