import java.util.Random;
public class DiceRoller {
	
	//Local 
	
/*	DiceRoller(){
*		Random random = new Random();
*		int number = 0;
*		roll(random, number);
*	}
*	void roll(Random random, int number){
*		number = random.nextInt(6)+1;
*		System.out.println(number);
*		
*	}
*/
	//Global
	
	int number;
	Random random;
	
	DiceRoller(){
		random = new Random();
		roll();
	}
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
