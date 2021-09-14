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

WebUI.callTestCase(findTestCase('CMS/Instagram Create Content Card/Create Content Card Keyword'), [('title') : title, ('keyword') : keyword], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Customer Attribute Snapshot', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/CustomerAttributeSnapshotName'), 'Customer Attribute Snapshot Katalon')

WebUI.click(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/DropdownCustomerAttributes'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/input_Customer Attributes'), 
    'instagram ID')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/input_Customer Attributes'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/input_Customer Attributes'), 
    'instagram name')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/input_Customer Attributes'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/input_Customer Attributes'), 
    'within 24h Window')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/CustumerAttributeSnapshot/input_Customer Attributes'), 
    Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Customer Attribute Snapshot Katalon', false)

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\IGCustAttributeSnapshotResult.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Success!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Berhasil!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.waitForPageLoad(0)

