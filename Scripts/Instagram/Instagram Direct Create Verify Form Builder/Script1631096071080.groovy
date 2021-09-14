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

WebUI.callTestCase(findTestCase('General/toIGBot'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigfb')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.verifyTextPresent('Please input your Full Name', false)

WebUI.delay(0)

WebUI.setText(findTestObject('Instagram Web/textField'), 'John Drue')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('Screenshot\\FB1Result.png')

WebUI.delay(0)

WebUI.verifyTextPresent('Please input your Email Address', false)

WebUI.delay(0)

WebUI.setText(findTestObject('Instagram Web/textField'), 'john@mailinator.com')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.takeScreenshot('Screenshot\\FB2Result.png')

WebUI.verifyTextPresent('Please input your Phone Number', false)

WebUI.delay(0)

WebUI.setText(findTestObject('Instagram Web/textField'), '+6234578971')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.takeScreenshot('Screenshot\\FB3Result.png')

WebUI.verifyTextPresent('Upload an image', false)

WebUI.delay(0)

WebUI.click(findTestObject('Instagram Web/browseImage'))

WebUI.uploadFile(findTestObject('Instagram Web/uploadImage'), 'D:\\AiChat\\Instagram\\Data Files\\aichat-banner-logo.jpg')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.verifyTextPresent('Thank You for Submitting the details. Have a Nice Day :)', false)

WebUI.verifyTextPresent('Hello John Drue', false)

WebUI.takeScreenshot('Screenshot\\Form Builder Result.png')

