public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;
        int numWorkingDays = 20;
        int empHrs, totalEmpHrs = 0, empWage, totalEmpWage;
        int MaxHrsInMonth = 100;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            if (empCheck == isPartTime) {
                empHrs = 8;
            } else if (empCheck == isFullTime) {
                empHrs = 16;
            } else {
                empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Days:" + totalWorkingDays + "Emp Hrs:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Employee Wage for month = " + totalEmpWage);
    }
}