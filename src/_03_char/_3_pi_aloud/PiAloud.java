package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	

	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.
   String mathHard = "3.141592653589793238462643";
   //
   String englush = "Wudhawdyuhaw";
   
   String piMath = "3.1415";
	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1
   System.out.println(englush.charAt(3));
   
   System.out.println(englush.length());
	// 4. Print ALL the digits of of the Pi String (hint: use a loop)
   //englush.length = 12
   //number of characters in englush = 12
   //Goal -  we want to print out all the chars in englush
   //0-11 inclusive 12
   // 11 minus 0 = 11 => this wouldn't get me enough chars WRONG
   for (int i = 0; i < englush.length(); i++) {
		System.out.println(englush.charAt(i));
   }
   
	// 5. Use the speak() method below to speak each digit of Pi.
  for (int i = 0; i < (englush.length()); i++) {
		speak(englush.charAt(i));
  }
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
   char galaxyBrain = getInputFromUser();
  System.out.println(galaxyBrain);
   
   
	// *7. Compare the users' char to the next digit of Pi
   
   		//Print out the first 5 digits of pi on a single line
  //this told the user the first 5 digits of pi
  // System.out.print(piMath);
   		
   //GOAL -- Tell the user "Type in the next digit of pi"
   System.out.print("what is the next digit of Pi?");
 //Ask the user for the next digit of pi using the getInputFromUser() method
   char galaxyBrain2 = getInputFromUser();
  
   
   //compare that to your pi variable that you have saved in the program already
   		//if the user is correct, print out "Correct" otherwise print out back to Bronze V"
   
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	
}	
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak)
	{
		System.out.print(characterToSpeak);
//		try {
//			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//f(x) = x + 2;
	// x = 3;
	//f(x) = 5;
	//f(x) =  function name
	// x  = data that we input
	// 5 = output or return value
	
	static char getInputFromUser() {
		System.out.println("made it here");
		Scanner scanner = new Scanner(System.in); 
		return scanner.next().toCharArray()[0];
	}

}


