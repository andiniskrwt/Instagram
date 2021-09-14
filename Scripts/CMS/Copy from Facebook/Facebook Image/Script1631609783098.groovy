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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Image', false)

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/browseImage'))

WebUI.uploadFile(findTestObject('CMS/Content Card/Card Type/image/uploadImage'), 'D:\\AiChat\\Instagram\\Data Files\\bigsize.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/doneUpload'))

WebUI.delay(3)

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/selectImage'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Card Type/Quick Reply/selectQR type'), 'text', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/input Title'), 'Home')

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/getAction'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/SelectAction_search'), 'Welcome Message')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/SelectAction_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Quick Reply/selectValue'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/image/scrollTo'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/browseImage Malay'))

WebUI.uploadFile(findTestObject('CMS/Content Card/Card Type/image/uploadImage'), 'D:\\AiChat\\Instagram\\Data Files\\bigsize.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/doneUpload'))

WebUI.delay(3)

WebUI.click(findTestObject('CMS/Content Card/Card Type/image/selectImage'))

WebUI.delay(1)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Quick Reply/input Title MY'), 'Beranda')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot('Screenshot\\FB image.png')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact6'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.verifyTextPresent('Will not be displayed', false)

WebUI.verifyTextPresent('Instagram image cannot be more than 8 MB.', false)

WebUI.verifyTextPresent('Quick Reply attachment not supported by IG.', false)

WebUI.takeFullPageScreenshot('Screenshot\\Copy From FB Image.png')

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Okay')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Baik')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.verifyTextNotPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.takeFullPageScreenshot('Screenshot\\Copy From FB Image 2.png')

