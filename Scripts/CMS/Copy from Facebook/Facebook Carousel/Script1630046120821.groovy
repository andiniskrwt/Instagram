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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Carousel', false)

WebUI.selectOptionByIndex(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/DelayCarousel'), 4)

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/browseImageCarousel'))

WebUI.uploadFile(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/uploadImageCarousel'), 'D:\\AiChat\\backup new new\\katalon\\Data Files\\aichat-banner-logo.jpg')

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/selectImage'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/URLField'), 'https://aichat.com/')

WebUI.sendKeys(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/URLField'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/Title'), 'AiChat')

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/eng text'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/eng text'), 'Award Winning Chatbot')

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/CarouselButton'), 'Action', false)

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/buttonTitle'), 'home')

WebUI.click(findTestObject('CMS/Content Card/Create Card/chooseAction'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/lastPagePopUpAction'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/WelcomeMessage'))

WebUI.scrollToElement(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/selectAttribute'), 0)

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/selectAttribute'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/select customer attribute type'), 'customer first name')

WebUI.sendKeys(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/select customer attribute type'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/selectAttribute'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/select customer attribute value'), 'not set')

WebUI.sendKeys(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/select customer attribute value'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/title malay'), 'AiChat')

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/malay text'), 'Solusi Chatbot Pemenang Penghargaan')

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/buttonTitle'), 'ke halaman awal')

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/attribute value malay'), 'not set')

WebUI.sendKeys(findTestObject('CMS/Content Card/Facebook Card Type/Carousel/attribute value malay'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Award Winning Chatbot', false)

WebUI.takeScreenshot('Screenshot/Carousel.png')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact8'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.verifyTextPresent('Will not be displayed', false)

WebUI.verifyTextPresent('Will not be displayed as template not supported.', false)

WebUI.takeFullPageScreenshot('Screenshot\\Carousel warning message.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Success!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Berhasil!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.verifyTextNotPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.takeFullPageScreenshot('Screenshot\\Carousel warning message 2.png')

