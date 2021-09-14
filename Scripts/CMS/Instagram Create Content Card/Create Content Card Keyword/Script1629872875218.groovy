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

WebUI.callTestCase(findTestCase('General/LoginCMS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CMS/toMenu/toContentListMenu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddnewContent'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('CMS/Content Card/Create Card/inputTitle'), title)

WebUI.click(findTestObject('CMS/Content Card/Create Card/copyFromTitle'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/label dropdown'))

WebUI.setText(findTestObject('CMS/Content Card/Create Card/add label'), '[Katalon] Instagram direct create ')

WebUI.sendKeys(findTestObject('CMS/Content Card/Create Card/add label'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/click outside'))

WebUI.check(findTestObject('CMS/Content Card/Create Card/KeywordMatchingYes'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/KeywordValue'))

WebUI.setText(findTestObject('CMS/Content Card/Create Card/inputKeyword'), keyword)

WebUI.sendKeys(findTestObject('CMS/Content Card/Create Card/inputKeyword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave Content'))

WebUI.delay(2)

WebUI.verifyTextPresent('Edit Content', false)

