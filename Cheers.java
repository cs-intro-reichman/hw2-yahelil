// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer_name = args[0].toUpperCase();
            int number_of_cheers = Integer.parseInt(args[1]);
            String lettersForAn = "AEFHILMNORSX";
            String an_a;
            
            for (int index = 0; index < cheer_name.length(); index++) {
                char c = cheer_name.charAt(index);
                if (lettersForAn.indexOf(c) != -1){
                        an_a = "an";
                    }
                    else{
                        an_a = "a ";
                    }
                System.out.println("Give me " + an_a + ' ' + c + ": " + c + '!');
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < number_of_cheers; i++) {
                System.out.println(cheer_name + "!!!");
            }
        }
}
