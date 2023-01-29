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

WebUI.click(findTestObject('Object Repository/Register_website/button_Buat                                _86b528'))

WebUI.setText(findTestObject('Object Repository/Register_website/input_Nama_name'), 'Dimas')

WebUI.setText(findTestObject('Object Repository/Register_website/input_Tanggal lahir_birth_date'), '19-July-2002')

WebUI.sendKeys(findTestObject('Object Repository/Register_website/input_Tanggal lahir_birth_date'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Register_website/input_E-Mail_email'), 'abc123@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register_website/input_Whatsapp_whatsapp'), '12345612345')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_website/input_Kata Sandi_password'), 'cZFrDSk31FeXmk+9CXLjXA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_website/input_Konfirmasi kata sandi_password_confirmation'), 
    'cZFrDSk31FeXmk+9CXLjXA==')

WebUI.click(findTestObject('Object Repository/Register_website/button_Daftar'))

WebUI.rightClick(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register_website/input_Konfirmasi kata sandi_inlineCheckbox1'), 
    0)

WebUI.delay(2)

WebUI.closeBrowser()

