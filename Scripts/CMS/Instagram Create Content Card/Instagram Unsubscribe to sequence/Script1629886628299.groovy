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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Unsubscribe from a Sequence', false)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Subscribe Unsubscribe to sequence/Select Sequence Unsubscribe'))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Subscribe Unsubscribe to sequence/sequence value Unsubscribe'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot('Screenshot\\IG Unsubscribe from sequence.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Unsubscribe from a Sequence')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Berhenti melanggan Urutan')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.waitForPageLoad(0)

