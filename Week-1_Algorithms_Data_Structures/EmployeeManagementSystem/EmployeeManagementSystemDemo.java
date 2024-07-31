package EmployeeManagementSystem;

public class EmployeeManagementSystemDemo {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee e1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee e2 = new Employee("E002", "Bob", "Developer", 50000);
        Employee e3 = new Employee("E003", "Charlie", "Designer", 45000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("Traversing Employee List:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID E002:");
        Employee searchedEmployee = ems.searchEmployeeById("E002");
        System.out.println(searchedEmployee != null ? searchedEmployee : "Employee not found");

        System.out.println("\nDeleting Employee with ID E001:");
        boolean isDeleted = ems.deleteEmployeeById("E001");
        System.out.println("Deleted: " + isDeleted);

        System.out.println("\nTraversing Employee List after deletion:");
        ems.traverseEmployees();
    }
}

