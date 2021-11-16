import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import java.awt.Robot
//import java.awt.event.KeyEvent
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ilovepdf.com/split_pdf')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Split PDF files online. Free service t_31c98c/span_Select PDF file'))

CustomKeywords.'Robot1.robotClass'()

WebUI.click(findTestObject('Object Repository/New Folder/Page_Split PDF files online. Free service t_31c98c/span_Select PDF file'))

//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

