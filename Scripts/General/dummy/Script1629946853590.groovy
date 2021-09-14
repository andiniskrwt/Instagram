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

WebUI.navigateToUrl('https://instagrambot.aichat.site/instagrambot/login')

WebUI.setText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_Sign in to start your session_email'), 'admin@aichat.co')

WebUI.setEncryptedText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_Sign in to start your session_password'), 
    'fW+CeLlFphMmshyY5v+okfqRaDMllBQ/')

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/button_Sign In'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_Contents'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_Content List'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_2'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_3'))

WebUI.setText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), 'sus')

WebUI.sendKeys(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_Instagram Customer Suspension'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_Instagram'))

WebUI.setText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), 'snap')

WebUI.sendKeys(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'))

WebUI.sendKeys(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), 'snap')

WebUI.sendKeys(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_- Label -_search'), 'snap')

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_Instagram Customer Attribute Snapshot'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/a_Instagram'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/button_Add New Card'))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/div_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dummy/Page_AiChat CMS/select_TextImageForm BuilderSubscriptionCon_1805f1'), 
    'customer_attribute_snapshot', true)

WebUI.setText(findTestObject('Object Repository/dummy/Page_AiChat CMS/input_Name_customer_attribute_snapshot_sheet_name'), 
    'instagram test')

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/div_Customer Attributes'))

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
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/dummy/Page_AiChat CMS/button_Save'))

WebUI.closeBrowser()

