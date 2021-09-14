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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Customer Attribute', false)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Customer attribute/select attribute'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Customer attribute/input Attribute'), 'Favorite Color')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Customer attribute/input Attribute'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Customer attribute/attribute value'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Customer attribute/input attribute value'), 'blue')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Customer attribute/input attribute value'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Customer Attribute ', false)

WebUI.click(findTestObject('CMS/Content Card/Create Card/fbAddNewCard'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'success!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'berhasil!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('Screenshot\\FBCustAttribute.png')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact6'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot('Screenshot\\Copy From FB Customer Attribute.png')

