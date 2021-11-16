import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://outlook.office365.com')

WebUI.setText(findTestObject('Outlook Page/userId'), 'dhiliptest1@outlook.com')

WebUI.click(findTestObject('Outlook Page/continueButton'))

WebUI.setEncryptedText(findTestObject('Outlook Page/input_Enter password_passwd'), 
    'ecPlVYQS407uRUX//GZA==')

WebUI.click(findTestObject('Outlook Page/input_Forgot password_idSIButton9'))

WebUI.click(findTestObject('Outlook Page/input_concat(Don, , t show this again)_idSIButton9'))

WebUI.sendKeys(findTestObject('Outlook Page/SearchEmail'), 'activate your Canada Post')

WebUI.click(findTestObject('Outlook Page/SearchButton'))

WebUI.click(findTestObject('Outlook Page/FilterButton'))

WebUI.click(findTestObject('Outlook Page/UnreadButton'))

WebUI.click(findTestObject('Outlook Page/Mailbox_emails'))

List<WebElement> links = driver.findElements(By.xpath("//div[@aria-label='Message body']/descendant::a"))

for(WebElement linkElement : links) {
	
	if(linkElement.getText().equalsIgnoreCase("https://www.w3schools.com/css/default.asp")) {
		
		linkElement.click()
	}
	
}