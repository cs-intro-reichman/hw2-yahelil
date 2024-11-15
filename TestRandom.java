// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int num_of_tests = Integer.parseInt(args[0]);
		int greater_counter = 0;
		int smaller_counter = 0;
		double num;
		for (int i = 0; i<num_of_tests;i++){
			num = Math.random();
			if (num > 0.5){
				greater_counter++;
			}
			else{
				smaller_counter++;
			}
		}
		double ratio;
		if (smaller_counter != 0){
			ratio = greater_counter/smaller_counter;
			System.out.println("> 0.5: "+ greater_counter + " times");
			System.out.println("<= 0.5: "+ smaller_counter + " times");
			System.out.println("Ratio: " + ratio);
		}
		else{
			System.out.println("> 0.5: "+ greater_counter + " times");
			System.out.println("<= 0.5: "+ smaller_counter + " times");
		}
		
	}
}
