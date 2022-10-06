public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int isEmpPresent = 1;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (isEmpPresent == empCheck) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
