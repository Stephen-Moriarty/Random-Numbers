import java.util.Scanner;
import java.util.Random;
public class Dice{
static int counter = 0;
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		Random r = new Random();
		int a;
		char b;
		
		String input;
		char choice = 'y';
		while(choice=='y' && choice!='n'){
			a = r.nextInt(6)+9856;
			b = (char) a;
			if(counter==0){
				// Do nothing
			}else{
				System.out.println(b);
				
			}
			System.out.println("Want a random dice roll (1-6)?");
			input = k.nextLine().toLowerCase();
			choice = input.charAt(0);
			counter++;
			choice=yellAtUserAndReturnCharacter(choice);
			
		}
	}
	public static char yellAtUserAndReturnCharacter(char h){
		// Methods should only do one thing but I wanted this one to do two and made sure to name it properly.
		if(h!='y' && h!='n'){
			System.out.println("That is not an option");
			counter=0;
			return 'y';
		}else{
			return h;
		}
	}
}
