import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office365.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=1&msaredir=1&client-request-id=1cecf547-c757-e6e8-d001-d03e9ce7751f&protectedtoken=true&claims=%7b%22id_token%22%3a%7b%22xms_cc%22%3a%7b%22values%22%3a%5b%22CP1%22%5d%7d%7d%7d&nonce=637724153904636957.baf40414-7719-452f-8849-22727d320d56&state=Dcs7EoAgDABR0PE4kZAvOQ4OQ2vp9U3xtttaSjnTkSpmihu7k3TlQDG2UL-fuQWlC7j3AFHaMIYEEDn5YsKlVvO92vvN9gM')

WebUI.click(findTestObject('Object Repository/Page_Sign in to Outlook/a_Create one'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Create account/input_Create account_MemberName'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Page_Create account/input_Create account_iSignupAction'))

WebUI.setText(findTestObject('Object Repository/Page_Create account/input_Create account_MemberName'), 'testttttt4567')

WebUI.click(findTestObject('Object Repository/Page_Create account/input_Create account_iSignupAction'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a password/input_privacy and cookies statement_iSignupAction'), 
    0)

WebUI.forward()

