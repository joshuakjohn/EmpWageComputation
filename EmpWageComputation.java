public class EmpWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        
        // UC 1 - Check Employee is Present or Absent
        int isPresent = (int)(Math.random() * 2); // Generates 0 or 1

        if (isPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
