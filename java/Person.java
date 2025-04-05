class Person{
    private int age;
    // constructor to initialize age
    public Person(int age) {
        if(age>=0){
            this.age = age;
        }
        else{
            System.out.println("Age cannot be negative");
    }
    }
    public int getAge(){
        return age;
    }
    private void setAge(int age){
        if(age>=0){
            this.age = age;
    } else{
        System.out.println("Age cannot be negative");
    }

}public void increaseAge(){
    setAge(this.age+1);
}

    public static void main(String[] args) {
        Person p = new Person(25);
        System.out.println("age is"+p.getAge());
        p.increaseAge();
        System.out.println("age after increase: "+p.getAge());
}
}
