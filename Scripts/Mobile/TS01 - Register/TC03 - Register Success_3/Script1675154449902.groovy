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

Mobile.startApplication('C:\\Users\\User-PC\\Downloads\\apk\\Demo_APP_CodingID_1.0.apk', true)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Login Here'), 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Register'), 0)

Mobile.setText(findTestObject('Object Repository/Register_Mobile/textbox_Nama'), 'Muhamad Trian Diwandanu', 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Calendar'), 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Pilih Tahun'), 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Tahun 2010'), 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Tanggal 25'), 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Calendar OK'), 0)

Mobile.setText(findTestObject('Object Repository/Register_Mobile/textbox_Email'), 'noreplydesignby@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Register_Mobile/textbox_Whatsapp'), '081288527785', 0)

Mobile.setText(findTestObject('Object Repository/Register_Mobile/textbox_Kata Sandi'), 'pw123456', 0)

Mobile.setText(findTestObject('Object Repository/Register_Mobile/textbox_Konfirmasi Kata Sandi'), 'pw123456', 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Checkbox'), 0)

Mobile.tap(findTestObject('Object Repository/Register_Mobile/button_Daftar'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Register_Mobile/text_Verification Email'), 0)

Mobile.closeApplication()

