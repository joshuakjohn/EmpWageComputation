public class EmpWageComputation {

    // Constants for wage calculation
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWageForMonth = 0; // Initialize total wage for the month

        // Calculate daily wage for each day in a month (20 working days)
        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int isPresent = (int) (Math.random() * 2); // Generates 0 or 1

            if (isPresent == 1) {
                System.out.println("Day " + day + ": Employee is Present");

                // Randomly decide if the employee is full-time or part-time
                int employeeType = (int) (Math.random() * 2); // Generates 0 or 1
                int workHours = 0;

                // Use switch case to determine work hours based on employee type
                switch (employeeType) {
                    case 1:
                        workHours = FULL_DAY_HOUR; // Full-time employee
                        System.out.println("Full-Time Employee");
                        break;
                    case 0:
                        workHours = PART_TIME_HOUR; // Part-time employee
                        System.out.println("Part-Time Employee");
                        break;
                    default:
                        workHours = 0; // Default case for unexpected values
                        break;
                }

                int dailyWage = WAGE_PER_HOUR * workHours; // Calculate daily wage
                System.out.println("Employee Wage for Day " + day + ": " + dailyWage);
                
                // Add daily wage to total wage for the month
                totalWageForMonth += dailyWage;

            } else {
                System.out.println("Day " + day + ": Employee is Absent");
            }
        }

        // Print the total wage for the month
        System.out.println("Total Employee Wage for the Month: " + totalWageForMonth);
    }
}
