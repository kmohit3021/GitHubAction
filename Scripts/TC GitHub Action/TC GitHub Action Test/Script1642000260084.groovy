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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/OR GitHub Action/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/a_Login'))

WebUI.doubleClick(findTestObject('Object Repository/OR GitHub Action/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/OR GitHub Action/input_Username_username'), 'John Doe')

WebUI.doubleClick(findTestObject('Object Repository/OR GitHub Action/input_Demo account_form-control_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/OR GitHub Action/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/OR GitHub Action/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR GitHub Action/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/OR GitHub Action/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/td_18'))

WebUI.setText(findTestObject('Object Repository/OR GitHub Action/textarea_Comment_comment'), 'Test for GitHub Action')

WebUI.click(findTestObject('Object Repository/OR GitHub Action/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/OR GitHub Action/a_Logout'))

