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

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigtext')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.verifyTextPresent('This text created by Katalon Automation', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

WebUI.takeFullPageScreenshot('Screenshot\\textResult.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigimg')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.delay(0)

WebUI.takeFullPageScreenshot('Screenshot\\imageResult.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigfb')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Please input your Full Name', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'John Drue')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\FB1Result.png')

WebUI.delay(1)

WebUI.verifyTextPresent('Please input your Email Address', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'john@mailinator.com')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\FB2Result.png')

WebUI.verifyTextPresent('Please input your Phone Number', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), '+6234578971')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\FB3Result.png')

WebUI.verifyTextPresent('Upload an image', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Instagram Web/uploadImage'), 'D:\\AiChat\\Instagram\\Data Files\\aichat-banner-logo.jpg')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Thank You for Submitting the details. Have a Nice Day :)', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyTextPresent('Hello John Drue', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshot\\Form Builder Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigs')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('subscribed!', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

WebUI.takeFullPageScreenshot('Screenshot\\subscriptionResult.png')

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigctb')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Hello John Drue', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

WebUI.takeFullPageScreenshot('Screenshot\\CTBResult.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigct')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('success!', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Customer Tag Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigapi')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Great, thanks for your feedback! 👍', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyTextPresent('Oops, sorry to hear about your experience. Would you like tell us why you feel this way?', false, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\APIResult.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigca')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('success!', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Customer Attribute Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigcas')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyTextPresent('Success!', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Customer Attribute Snapshot Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigse')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyTextPresent('Email Sent!', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Send Email Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kiglc')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyTextPresent('Live chat start', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'hi')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'hola there')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'exit')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'hi')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Hello John Drue', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Live Chat Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigsts')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Subscribe to Sequence success', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeScreenshot('Screenshot\\Subscribe to a Sequence Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigunsub')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('Unsubscribe from a Sequence', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Unsubscribe from a Sequence Result.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Instagram Web/textField'), 'kigcs')

WebUI.sendKeys(findTestObject('Instagram Web/textField'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyTextPresent('you are suspended', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\Cust SuspensionResult.png')

