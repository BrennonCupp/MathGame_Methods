
public class Methods {
	public static void main(String[] args) {
		
		char letter = generateRandomCharacter();
		generateRandomCharacter();
		testGenerateRandomCharacter();
		//System.out.print(letter);
		
	}
public static char generateRandomCharacter(){
	int starting = 65;
	int ending = 26;
	char letterRandom = (char)(starting + Math.random()*ending);
	System.out.print(letterRandom);
	return letterRandom;
}
public static void testGenerateRandomCharacter(){
	
	for (int i = 65; i<=90; i++){
		System.out.println("\nOur letter is : " + (char)i);
		boolean haveAMatch = false;
		while(!haveAMatch){
			char letter = generateRandomCharacter();
		}
	generateRandomCharacter();
	}
}

}
