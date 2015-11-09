import java.util.Scanner;
public class MathGameV2 {
	public static void main(String[] args) {

		//Call the addition game
		int score;
		additionGameMethod();

	}
	public static void additionGameMethod(){
		
		int score = 0;
		int hardness = 5;
		int stopIndex = 2;
		for(int index = 0; index<stopIndex; index=index+1){
			//System.out.println("Hello!");
			isAnswerCorrect = checkAnswerMethod(hardness);
			if(isAnswerCorrect){
				System.out.println("Correct");
			}else{
				System.out.println("Incorrect");
			}
		}
		
		
		
		return;
	}
	public static boolean checkAnswerMethod(int hardness){
		
		return false;
	}
}
