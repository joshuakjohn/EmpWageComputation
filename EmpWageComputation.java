public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC 1 - Check Employee is Present or Absent
        int isPresent = (int) (Math.random() * 2); // Generates 0 or 1

        if (isPresent == 1) {
            System.out.println("Employee is Present");

            // UC 3 - Add Part-time Employee & Wage using Switch Case
            int wagePerHour = 20;
            int fullDayHour = 8;
            int partTimeHour = 4;
            int employeeType = (int) (Math.random() * 2); // Generates 0 or 1

            int dailyWage = 0;
            int workHours = 0;

            // Using switch case to determine work hours
            switch (employeeType) {
                case 1: 
                    workHours = fullDayHour; // Full-time employee
                    System.out.println("Full-Time Employee");
                    break;
                case 0: 
                    workHours = partTimeHour; // Part-time employee
                    System.out.println("Part-Time Employee");
                    break;
                default: 
                    workHours = 0; // Default case for unexpected values
                    break;
            }

            dailyWage = wagePerHour * workHours;
            System.out.println("Employee Wage: " + dailyWage);

        } else {
            System.out.println("Employee is Absent");
        }
    }
}
