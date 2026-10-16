package SalaryManagement;

public class AdminStaff extends Employee {

    private double basicSalary;
    private double overtimePay;

    public AdminStaff(String employeeId, String name, String department,
            double basicSalary, double overtimePay) {
        super(employeeId, name, department);
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + overtimePay;
    }

    public void displayStaffType() {
        System.out.printf("%-14s:  %s%n", "Employee Type", "Administrative Staff");
    }

    public void displayFacultyType() {
        displayStaffType();
    }
}
