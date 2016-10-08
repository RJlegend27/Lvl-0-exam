import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class lvl0examCoding {

	public static void main(String[] args) {
		String colorInput;
		Robot steelers = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
colorInput = JOptionPane.showInputDialog("What color do you want?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
	if(colorInput.equalsIgnoreCase("blue")){
		steelers.setPenColor(0, 0, 255);
	}else if(colorInput.equalsIgnoreCase("yellow")){
		steelers.setPenColor(255, 0, 0);
	}
   	 // 2. set the pen width to 10
		
   	 // 1. make the Robot draw a shape
		
		steelers.penDown();
		steelers.setPenWidth(10);
		for(int i=0; i<4; i++){
			steelers.move(50);
			steelers.turn(90);
		}
		steelers.penUp();
		steelers.move(150);
		
    }

}
