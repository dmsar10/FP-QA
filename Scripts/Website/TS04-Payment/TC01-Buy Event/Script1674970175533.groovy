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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Object Repository/Payment/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Payment/input_Email_email'), 'dmsar141@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Payment/input_Kata                                 _98da12'), 'cZFrDSk31FeaspcjiMwZ6g==')

WebUI.click(findTestObject('Object Repository/Payment/button_Login'))

WebUI.click(findTestObject('Object Repository/Payment/a_Events'))

WebUI.click(findTestObject('Object Repository/Payment/div_Day 4 Workshop                         _31d43a'))

WebUI.click(findTestObject('Object Repository/Payment/a_Beli Tiket'))

WebUI.click(findTestObject('Object Repository/Payment/a_Lihat                Pembelian Saya'))

WebUI.click(findTestObject('Object Repository/Payment/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Payment/input_Total Pembayaran_payment_method'))

WebUI.click(findTestObject('Object Repository/Payment/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Payment/img_PT Dwidata Talenta Prima_logo'))

WebUI.verifyElementText(findTestObject('Object Repository/Payment/h4_Rangkuman Pembelian'), 'Rangkuman Pembelian')

WebUI.deleteAllCookies()

WebUI.closeBrowser()
