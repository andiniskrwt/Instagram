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

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Text before Quick Reply')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Teks sebelum Balasan Pantas')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.takeFullPageScreenshot('Screenshot\\Text before QR.png')

WebUI.delay(3)

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Quick Reply', false)

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Card Type/Quick Reply/selectQR type'), 'text', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/input Title'), 'home')

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/getAction'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/SelectAction_search'), 'Welcome Message')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/SelectAction_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/selectValue'))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/button_Browse'))

WebUI.uploadFile(findTestObject('CMS/Content Card/Card Type/image/uploadImage'), 'D:\\AiChat\\Instagram\\Data Files\\lt06.jpg')

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/selectImage'))

WebUI.delay(0)

WebUI.verifyTextPresent('Quick Reply image attachment is not supported by IG. Please remove the image', false)

WebUI.scrollToElement(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 0)

WebUI.delay(0)

WebUI.takeScreenshot('Screenshot\\QR warning image not supported.png')

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/button_Remove'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Quick Reply/scrollTo'), 0)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/input attribute'), 'Customer Quick Reply')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Quick Reply/input attribute'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/addMore'))

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Card Type/Quick Reply/selectQR type 2'), 'text', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/inputTitle2'), 'Main Menu')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Quick Reply/scroll to 2'), 0)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/selectAction 2'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/SelectAction_search'), 'Main Menu')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/SelectAction_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/main menu value'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/input Title MY'), 'Beranda')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/titleMalay2'), 'Menu Utama')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.takeFullPageScreenshot('Screenshot\\IGQuickReplyResult.png')

