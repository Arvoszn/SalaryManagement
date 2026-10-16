package SalaryManagement;

public class Test {

    public static void main(String[] args) {
        displayHeader();

        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeFaculty("FT001", "Juan Dela Cruz",
                "Information Technology", 30000.00, 5000.00);
        employees[1] = new PartTimeFaculty("PT001", "Maria Santos",
                "Business Administration", 600.00, 30.00);
        employees[2] = new AdminStaff("AS001", "Pedro Garcia",
                "Finance", 25000.00, 2500.00);

        for (int i = 0; i < employees.length; i++) {
            displayEmployee(employees[i]);
            if (i < employees.length - 1) {
                System.out.println("--------------------------------------------------");
                System.out.println();
            }
        }

        displaySummary();
    }

    public static void displayHeader() {
        System.out.println("==================================================");
        System.out.println("      DON JOSE ECLEO MEMORIAL COLLEGE");
        System.out.println("           EMPLOYEE PAYROLL SYSTEM");
        System.out.println("==================================================");
    }

    public static void displayEmployee(Employee employee) {
        employee.displayEmployeeInfo();

        if (employee instanceof FullTimeFaculty) {
            ((FullTimeFaculty) employee).displayFacultyType();
        } else if (employee instanceof PartTimeFaculty) {
            ((PartTimeFaculty) employee).displayFacultyType();
        } else if (employee instanceof AdminStaff) {
            ((AdminStaff) employee).displayStaffType();
        }

        System.out.printf("%-14s:  PHP %,.2f%n", "Salary", employee.calculateSalary());
    }

    public static void displaySummary() {
        System.out.println("==================================================");
        System.out.println("Total Employees: " + Employee.getEmployeeCount());
        System.out.println("==================================================");
    }
}
