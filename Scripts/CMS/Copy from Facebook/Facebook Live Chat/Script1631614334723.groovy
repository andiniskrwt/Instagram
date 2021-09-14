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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Live Chat', false)

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Card Type/LiveChat/ChatTimeOut'), '2 hour', false)

'NOTE:\r\nfor field Stop Word and Email using ID = react-select-X-input\r\nthe X number depend on the sequence number of the card\r\nexample this step is on the first card and the id will start on 4 the next field will have id 5\r\nbecause this card have 2 language the stop word on other language id will countunie from before and that is 6\r\n\r\nSo if the step will create on 2 or 3rd card please check the id sequence number'
WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/clickStopWordEN'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/LiveChat/StopWordEN'), 'exit')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/LiveChat/StopWordEN'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/btnGetRediriction'))

WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/searchAction'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/LiveChat/searchAction'), 'live chat stop')

WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/stopValue'))

WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/clickEmailEN'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/LiveChat/EmailEN'), 'andini@mailinator.com')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/LiveChat/EmailEN'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/clickStopWordMY'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/LiveChat/StopWordMY'), 'keluar')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/LiveChat/StopWordMY'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/LiveChat/clickEmailMY'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/LiveChat/EmailMY'), 'andini@mailinator.com')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/LiveChat/EmailMY'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\FBLiveChatResult.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/fbAddNewCard'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Live chat start')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Permulaan sembang langsung')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact8'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('Screenshot\\Copy From FB Live Chat.png')

