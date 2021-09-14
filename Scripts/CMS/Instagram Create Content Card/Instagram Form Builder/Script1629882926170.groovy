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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Card Type/Form Builder/TypeDropdown'), 'Text', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/TypeTextValue'), 'Please input your Full Name')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'), 0)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'))

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Card Type/Form Builder/Type2field'), 'Email', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/EmailTextValue'), 'Please input your Email Address')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'), 0)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'))

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Card Type/Form Builder/Type3Field'), 'Phone', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/PhoneTextValue'), 'Please input your Phone Number')

WebUI.scrollToElement(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'), 0)

WebUI.click(findTestObject('CMS/Content Card/Card Type/Form Builder/btnAddNewField'))

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Card Type/Form Builder/Type4field'), 'Image only', false)

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/ImageTextValue'), 'Upload an image')

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

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/TypeTextValue'), 'Masukkan Nama Lengkap')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/EmailTextValue'), 'Masukkan Email')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/PhoneTextValue'), 'Masukkan Nomor Handphone')

WebUI.setText(findTestObject('CMS/Content Card/Card Type/Form Builder/ImageTextValue'), 'Unggah Foto')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.verifyTextPresent('Feedback', false)

WebUI.takeFullPageScreenshot('Screenshot\\IGFBResult.png')

