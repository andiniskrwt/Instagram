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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Product Responder', false)

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Facebook Card Type/Product Responder/field1pairing'), 'name_equal', 
    false)

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Facebook Card Type/Product Responder/field2pairing'), 'name_like', 
    false)

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Facebook Card Type/Product Responder/filed3pairing'), 'attribute1_like', 
    false)

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.takeScreenshot('Screenshot\\Product Responder.png')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact6'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.verifyTextPresent('Will not be displayed', false)

WebUI.verifyTextPresent('Will not be displayed as template not supported.', false)

WebUI.takeFullPageScreenshot('Screenshot\\Product Responder Copy from FB.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Okay')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Baik')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.verifyTextNotPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.takeFullPageScreenshot('Screenshot\\Product Responder Copy from FB 2.png')

