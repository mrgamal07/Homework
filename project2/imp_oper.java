class Employee {
    String name;
    double salary;
    int experience;
    boolean isPermanent;
    
    public Employee(String name, double salary, int experience, boolean isPermanent) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.isPermanent = isPermanent;
    }
    
    public double calculateBonus() {
        // Arithmetic and Ternary Operator
        return (experience > 5) ? salary * 0.10 : salary * 0.05;
    }
    
    public boolean isEligibleForPromotion() {
        // Logical and Relational Operators
        return (experience > 3 && isPermanent) || salary > 70000;
    }
}

public class CompanyPayroll {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 60000, 6, true);
        Employee emp2 = new Employee("Jane Smith", 45000, 2, false);
        
        // Assignment Operator
        double emp1Bonus = emp1.calculateBonus();
        double emp2Bonus = emp2.calculateBonus();
        
        System.out.println(emp1.name + " Bonus: " + emp1Bonus + " Eligible for Promotion: " + emp1.isEligibleForPromotion());
        System.out.println(emp2.name + " Bonus: " + emp2Bonus + " Eligible for Promotion: " + emp2.isEligibleForPromotion());
        
        // Bitwise Operator Example (Simulating Security Access Levels)
        int adminAccess = 0b110; // Binary representation for read & write access
        int userAccess = 0b100;  // Binary representation for read-only access
        int newAccess = adminAccess | userAccess; // Bitwise OR to grant all permissions
        
        System.out.println("Updated Access Level: " + Integer.toBinaryString(newAccess));
    }
}
