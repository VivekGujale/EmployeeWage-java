public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        final int isPartTime = 1;
        final int isFullTime = 2;
        int empRatePerHr = 20;
        int empHrs, empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10 % 3);
        switch (empCheck) {
            case isPartTime:
                empHrs = 8;
                break;
            case isFullTime:
                empHrs = 16;
                break;
            default:
                empHrs = 0;
        }
        empWage = empRatePerHr * empHrs;
        System.out.println("Employee Wage=" + empWage);
    }
}
