public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        
        // UC 1 - Check Employee is Present or Absent
        int isPresent = (int)(Math.random() * 2); // Generates 0 or 1

        if (isPresent == 1) {
            System.out.println("Employee is Present");

            // UC 2 - Calculate Daily Employee Wage
            int wagePerHour = 20;
            int fullDayHour = 8;
            int dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
