// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int top_seed = Integer.parseInt(args[0]);
		String mood = args[1];
		int number_of_steps;
		int seed = 1;
		int value;

		if (mood.equals("v")){
			while (seed < top_seed+1){
				value = seed;
				number_of_steps = 0;
				if (value == 1){
					System.out.print(value + " ");
					number_of_steps = 1;
					value = 4; // value*3 + 1
				}
				while (value != 1){
					System.out.print(value + " ");
					number_of_steps++;
					if (value % 2 == 0){
						value /= 2;
					}
					else{
						value = value*3 + 1;
					}
				}
				System.out.print(value + " ");
				number_of_steps++;
				System.out.println("(" + number_of_steps + ")");
				seed++;
			}
			System.out.println("Every one of the first " + top_seed + " hailstone sequences reached 1.");
		}
		else{
			while (seed < top_seed+1){
				value = seed;
				if (value == 1){
					value = 4; // value*3 + 1
				}
				while (value != 1){
					if (value % 2 == 0){
						value /= 2;
					}
					else{
						value = value*3 + 1;
					}
				}
				seed++;
			}
			System.out.println("Every one of the first " + top_seed + " hailstone sequences reached 1.");
		}
		
	}
}
