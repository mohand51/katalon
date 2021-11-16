import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.event.KeyEvent
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



public class Robot1 {

	@Keyword
	public void robotClass() {
		Robot robot = new Robot();
		//Thread.sleep(4000);
		//robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		//System.out.println("a");
		robot.keyPress(KeyEvent.VK_TAB);
				
		Thread.sleep(4000);
		//WebUI.mouseOverOffset(findTestObject(null), 50, 50)
		WebUI.click(findTestObject(null))
		
		robot.mouseMove(50, 50)
		//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
	//	WebUI.mouseOverOffset(findTestObject(null), 50, 50)
		
		//System.out.println("c");
	}
}
