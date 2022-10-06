public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int isFullTime = 1;
        int empRatePerHr = 20;
        int empHrs, empWage = 0;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (empCheck == isFullTime) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empRatePerHr * empHrs;
        System.out.println("Employee Wage=" + empWage);
    }
}
