import java.util.Scanner;

public class LiftCalc {

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to lift calc, this calculator will tell you\n" + 
						"your projected 1 rep maximum weight based on past attempts.\n" + 
						"-----------------\n" + 
						"Do you use the metric system or the imperial system?\n");
		String measure = in.nextLine();
		while ((!measure.equalsIgnoreCase("metric")) && (!measure.equalsIgnoreCase("imperial"))){
			System.out.println("Please specify either metric or imperial: ");
			measure = in.nextLine();
		}
		
		System.out.println("Is this an upper or lower body exercise?");
		String ex = in.next();
		while ((!ex.equalsIgnoreCase("upper")) && (!ex.equalsIgnoreCase("lower"))) {
			System.out.println("Please specify either upper or lower: ");
			ex = in.next();
		}
		
		System.out.println("Enter your maximum weight at 4-6 reps: ");
		double max = 0;
		while (max <= 0) {
			if (in.hasNextInt()) {
				max = in.nextInt();
			}else {
				System.out.println("Please enter a positive integer: ");
			}
		}
		RepCalc maxreps = new RepCalc();
		
		if (measure.equalsIgnoreCase("metric") && ex.equalsIgnoreCase("upper")) {
			System.out.println("Your projected 1 rep maximum for this upper body exercise is " + maxreps.UpperCalcKg(max) + " kg.");
		}else if (measure.equalsIgnoreCase("metric") && ex.equalsIgnoreCase("lower")) {
			System.out.println("Your projected 1 rep maximum for this lower body exercise is " + maxreps.LowerCalcKg(max) + " kg.");
		}else if (measure.equalsIgnoreCase("imperial") && ex.equalsIgnoreCase("upper")) {
			System.out.println("Your projected 1 rep maximum for this upper body exercise is " + maxreps.UpperCalcLbs(max) + " lbs.");
		}else if (measure.equalsIgnoreCase("imperial") && ex.equalsIgnoreCase("lower")) {
			System.out.println("Your projected 1 rep maximum for this lower body exercise is " + maxreps.LowerCalcLbs(max) + " lbs.");
		}
	
	}
}
