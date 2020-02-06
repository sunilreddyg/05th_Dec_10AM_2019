package robot_window_Interfaces;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Actions_At_Notepad_File 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		//Launch notepad at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press down shift key at real keyboard
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		//Type Hello mindq text at notepad
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_Q);
		
		//Release key after completed action
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

}
