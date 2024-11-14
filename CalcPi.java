// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int number_of_steps = Integer.parseInt(args[0]);
		double denominator = 1;
		double approximated_pi = 0;
		for (int i = 0; i < number_of_steps ;i++){
			if (i % 2 == 0){
				approximated_pi += 1/denominator;
			}
			else{
				approximated_pi -= 1/denominator;
			}
			denominator += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + approximated_pi*4);
	}
}
