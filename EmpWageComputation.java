public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC 1 - Check Employee is Present or Absent
        int isPresent = (int)(Math.random() * 2); // Generates 0 or 1

        if (isPresent == 1) {
            System.out.println("Employee is Present");

            // UC 3 - Add Part-time Employee & Wage
            int wagePerHour = 20;
            int fullDayHour = 8;
            int partTimeHour = 4;
            int employeeType = (int)(Math.random() * 2); // Generates 0 or 1

            int dailyWage = 0;
            if (employeeType == 1) {
                dailyWage = wagePerHour * fullDayHour;
                System.out.println("Full-Time Employee Wage: " + dailyWage);
            } else {
                dailyWage = wagePerHour * partTimeHour;
                System.out.println("Part-Time Employee Wage: " + dailyWage);
            }
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
