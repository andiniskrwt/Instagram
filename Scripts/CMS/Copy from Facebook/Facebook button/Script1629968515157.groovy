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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Button', false)

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Button/button name eng'), 'Button Katalon')

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Facebook Card Type/Button/selectButtonType'), 'web_url_blank', 
    false)

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Button/ClickTitle'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Button/TitleEn'), 'To AiChat')

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Button/ClickURL'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Button/URLEn'), 'https://aichat.com/')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Button/button name malay'), 'Tombol Katalon')

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Button/ClickTitle'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Button/TitleIMY'), 'To AiChat')

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Button/ClickURL'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Button/URLMY'), 'https://aichat.id/')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Button Katalon', false)

WebUI.takeScreenshot('Screenshot\\ButtonResult.png')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact8'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.verifyTextPresent('Will not be displayed', false)

WebUI.verifyTextPresent('Will not be displayed as template not supported.', false)

WebUI.takeFullPageScreenshot('Screenshot\\Button Warning message.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Success!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Berhasil!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.waitForPageLoad(0)

WebUI.verifyTextNotPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.takeFullPageScreenshot('Screenshot\\Button Warning message 2.png')

