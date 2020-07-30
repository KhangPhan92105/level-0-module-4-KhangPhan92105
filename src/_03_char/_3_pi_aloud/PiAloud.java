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
	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1
   System.out.println(englush.charAt(3));
   
   System.out.println(mathHard.length());
	// 4. Print ALL the digits of of the Pi String (hint: use a loop)
   for (int i = 0; i < (englush.length()); i++) {
		System.out.println(englush.charAt(i));
   }
	// 5. Use the speak() method below to speak each digit of Pi.
   for (int i = 0; i < (englush.length()); i++) {
		speak(englush.charAt(i));
  }
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
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

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


