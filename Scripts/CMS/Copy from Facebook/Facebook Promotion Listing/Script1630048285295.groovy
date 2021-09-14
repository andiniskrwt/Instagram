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

WebUI.selectOptionByLabel(findTestObject('CMS/Content Card/Create Card/cardDropdown'), 'Promotion Listing', false)

WebUI.selectOptionByValue(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_sortBy'), 
    'id_desc', false)

WebUI.scrollToElement(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_beforeResultMessage'), 
    0)

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_beforeResultMessage'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_beforeResultMessage'), 
    'Here are the result')

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_Get Redirection'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/SelectAction_search'), 'Welcome Message')

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/SelectAction_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/selectAction'))

WebUI.click(findTestObject('CMS/Content Card/Create Card/malayTab'))

WebUI.scrollToElement(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_beforeResultMessage'), 
    0)

WebUI.click(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_beforeResultMessage'))

WebUI.setText(findTestObject('CMS/Content Card/Facebook Card Type/Promotion Listing/promotionListing_beforeResultMessage'), 
    'Pesan Sebelum Hasil')

WebUI.click(findTestObject('CMS/Content Card/Create Card/btnSaveCard'))

WebUI.takeScreenshot('Screenshot\\PromotionListingResult.png')

WebUI.click(findTestObject('CMS/Content Card/Create Card/ig tab'))

WebUI.scrollToPosition(999, 999)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/copyFrom'))

WebUI.delay(0)

WebUI.click(findTestObject('CMS/Content Card/Instagram Copy from/facebookreact4'))

WebUI.waitForPageLoad(0)

WebUI.takeFullPageScreenshot('Screenshot\\Promotion Listing Warning message.png')

WebUI.verifyTextPresent('Please create new content or copy from other channel (only supported content cards are copied) for the best user experience.', 
    false)

WebUI.verifyTextPresent('Will not be displayed', false)

WebUI.verifyTextPresent('Will not be displayed as template not supported.', false)

