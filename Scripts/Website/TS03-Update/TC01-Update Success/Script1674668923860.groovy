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

WebUI.click(findTestObject('Object Repository/Update_website/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Update_website/input_Email_email'), 'dmsar141@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Update_website/input_Kata                                 _98da12'), 'cZFrDSk31FeaspcjiMwZ6g==')

WebUI.click(findTestObject('Object Repository/Update_website/button_Login'))

WebUI.click(findTestObject('Object Repository/Update_website/i_Kontak_fas fa-user-alt'))

WebUI.click(findTestObject('Object Repository/Update_website/a_My Account'))

WebUI.click(findTestObject('Object Repository/Update_website/span_Profil'))

WebUI.click(findTestObject('Object Repository/Update_website/a_Edit Profile'))

WebUI.click(findTestObject('Object Repository/Update_website/div_Fullname                               _a7cccf'))

WebUI.setText(findTestObject('Object Repository/Update_website/input_Fullname_name'), 'dimas')

WebUI.click(findTestObject('Object Repository/Update_website/div_Fullname                               _a7cccf'))

WebUI.setText(findTestObject('Object Repository/Update_website/input_Phone_whatsapp'), '121212121212')

WebUI.click(findTestObject('Object Repository/Update_website/div_Fullname                               _a7cccf'))

WebUI.setText(findTestObject('Object Repository/Update_website/input_BirthDay_birth_date'), '29-Apr-2001')

WebUI.click(findTestObject('Object Repository/Update_website/input_Phone_whatsapp'))

WebUI.click(findTestObject('Object Repository/Update_website/button_Save Changes'))

WebUI.verifyTextPresent('Berhasil', true)

WebUI.click(findTestObject('Object Repository/Update_website/button_OK'))

WebUI.closeBrowser()

