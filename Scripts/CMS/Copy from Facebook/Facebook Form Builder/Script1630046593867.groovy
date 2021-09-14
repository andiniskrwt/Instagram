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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Form Builder', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/OutputEmailAddressEN'), 'andini@mailinator.com')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Form Builder/OutputEmailAddressEN'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Subject'), 'Feedback')

WebUI.delay(2)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/CompletedMessage'), 'Thank You for Submitting the details. Have a Nice Day :)')

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/CompleteRedirectButton'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/lastPagePopUpAction'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/WelcomeMessage'))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/clickExitWord'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/ExitKeywordEN'), 'done')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Form Builder/ExitKeywordEN'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/ExitRedirectBtn'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/lastPagePopUpAction'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/WelcomeMessage'))

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/Type Dropdown'), 'file', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/File only text'), 'Please upload file')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'), 0)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'))

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Card Type/Form Builder/Type2field'), 'file-image', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/File-ImageTextValue'), 'Please upload file or image')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'), 0)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'))

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Card Type/Form Builder/Type3Field'), 'location', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/LocationTextValue'), 'Please input Location')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Subject'), 'Umpan Balik')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/OutputEmailAddressMY'), 'andini@mailinator.com')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Form Builder/OutputEmailAddressMY'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/CompletedMessage'), 'Terimakasih telah mengisi data. Semoga Harimu Menyenangkan :)')

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/clickExitWord'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/ExitKeywordMY'), 'selesai')

WebUI.sendKeys(findTestObject('CMS/Content Card/Card Type/Form Builder/ExitKeywordMY'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/File only text'), 'Unggah file')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/File-ImageTextValue'), 'Unggah File atau Foto')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/Facebook FB/LocationTextValue'), 'Unggah Lokasi')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Feedback', false)

WebUI.takeScreenshot('Screenshot\\Copy from facebook FBResult.png')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Instagram Copy from/scroll to'), 0)

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact14'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.verifyTextPresent('Will not be displayed as contain field types not supported (file,file-image,location).', false)

WebUI.takeFullPageScreenshot('Screenshot\\Form Builder warning message.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnAddCardIG'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputText'), 'Success!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Text/inputTextMalay'), 'Berhasil!')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSave'))

WebUI.delay(1)

WebUI.verifyTextNotPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.takeFullPageScreenshot('Screenshot\\Form Builder warning message 2.png')

