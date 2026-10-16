package SalaryManagement;

public abstract class Employee {

    private String employeeID;
    private String name;
    private String department;
    private static int employeeCount = 0;

    public Employee() {
        employeeCount++;
    }

    public Employee(String employeeId, String name, String department) {
        this.employeeID = employeeId;
        this.name = name;
        this.department = department;
        employeeCount++;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int count) {
        employeeCount = count;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.printf("%-14s:  %s%n", "EmployeeID:", employeeID);
        System.out.printf("%-14s:  %s%n", "Name", name);
        System.out.printf("%-14s:  %s%n", "Department", department);
    }

    public void displayEmployeeInfo(boolean showSalary) {
        displayEmployeeInfo();
        if (showSalary) {
            System.out.printf("%-14s:  PHP %,.2fn&", "Salary", calculateSalary());
        }
    }
}
