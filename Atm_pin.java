import java.util.Random;

public class Atm_pin_Generator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int dice = random.nextInt(6)+1;
		
		System.out.println("Dice outcome:"+dice);
		
		
		int pin = 7080;
		
		int guess = 0;
		
		int even =0;
		
		int odd = 0;
		
		int counter = 0;
		
		while(guess != pin) {
			
			if(guess%2 == 1) {
				odd++;
			}
			else {
				even++;
			}
			counter++; 
			
			guess = random.nextInt(10000);
			System.out.println("Guess: "+guess);
			
			if(guess == pin) {
				System.out.println("Correct guess " + guess);
				System.out.println("Correct guess in " + counter + " iterations");
				System.out.println("guesses for odd number are " + odd );
				System.out.println("guesses for even number are " + even );
			}
		}
	}

}
