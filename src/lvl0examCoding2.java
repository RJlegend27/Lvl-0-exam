/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class lvl0examCoding2 {
	public static void main(String[] args) {
		String userAge;
		int x = 2016;
		userAge = JOptionPane.showInputDialog("What is your age");
		
		
		int userAge2 = Integer.parseInt(userAge);
		int y =(x - userAge2);
		JOptionPane.showMessageDialog(null,"You were born in " + y);
		if(userAge2>30){
			JOptionPane.showMessageDialog(null, "You are too old to play this game");
		}
	}

}

