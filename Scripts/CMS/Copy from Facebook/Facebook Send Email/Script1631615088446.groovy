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

WebUI.callTestCase(findTestCase('CMS/Copy from Facebook/Create Content Card Keyword Facebook'), [('title') : title, ('keyword') : keyword], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CMS/Content Card/Create Card/fbAddNewCard'))

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'send_email', false)

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Please check again for mandatory fields', false)

WebUI.verifyTextPresent('Email Addresses is required.', false)

WebUI.verifyTextPresent('Email subject is required.', false)

WebUI.verifyTextPresent('Email body is required.', false)

WebUI.takeScreenshot('Screenshot\\Error message empty field.png')

WebUI.click(findTestObject('CMS/Content Card/Card Type/Send Email/div_Email Addresses'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Send Email/input Email Addresses'), 'andini@mailinator.com')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Send Email/input Email Addresses'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Send Email/email subject'), 'automation')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Send Email/email subject'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Send Email/email body'), 'This email send from CMS by automation Katalon')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\FB Send Email Result.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/fbAddNewCard'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Email Sent!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'email dikirim')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact6'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('Screenshot\\Copy From FB Send Email.png')

