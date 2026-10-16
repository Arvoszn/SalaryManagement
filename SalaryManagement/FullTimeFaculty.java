package SalaryManagement;

public class FullTimeFaculty extends Employee {

    private double monthlySalary;
    private double allowance;

    public FullTimeFaculty(String employeeId, String name, String department,
            double monthlySalary, double allowance) {
        super(employeeId, name, department);
        this.monthlySalary = monthlySalary;
        this.allowance = allowance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
public void setMonthlySalary(double MonthlySalary) {
    this.setMonthlySalary(MonthlySalary);
}
    public double getAllowance(){
        return allowance;
    }
    public void setAllowance (double Allowance){
        this.allowance = allowance;
    }
    @Override 
    public double calculateSalary(){
        return monthlySalary + allowance;
    }
    public void displayFacultyType (){
        System.out.printf("%-14s:  %s%n", "Employee Type", "Full Time Faculty");
    }
}

