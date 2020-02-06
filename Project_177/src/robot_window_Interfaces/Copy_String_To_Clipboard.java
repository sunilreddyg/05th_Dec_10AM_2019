package robot_window_Interfaces;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Copy_String_To_Clipboard {

	public static void main(String[] args) throws Exception {
		
		//Launch notepad at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="If you want to create quick bug reproduction scripts, create scripts to aid in ";
		
		//select string
		StringSelection Stext=new StringSelection(text);
		//Get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Add copied text to system clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Press Control+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Relese control 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
