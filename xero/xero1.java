package xero;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class xero1 extends xeroreuse {
public static void main(String[] args) throws InterruptedException {
	
	//TestID01A();
	//TestID01B();
	//TestID01C();
	//TestID01D();
	//TestID02A();
	//TestID02B();
	TestID02C();     //privacy pblm
	//TestID02D();   
	//TestID02E();
	//TestID03A();
	//TestID04A();
}
	


public static void TestID01A() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero1A.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero1A");
	Thread.sleep(3000);
	WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
	clickObj(loginbutton,"login");
	String actualmsg=driver.getTitle();
	System.out.println(""+actualmsg);
	validatemsg(actualmsg,"Login | Xero Accounting Software");
	WebElement username=FindElement(By.id("email"),"username");
	enterText(username,"bindukonda89@gmail.com", "username");
	
	WebElement password=FindElement(By.id("password"),"Password");
	enterText(password,"Password89","Password");
	WebElement login=FindElement(By.id("login"),"login");
	clickObj(login,"login");
	String actualmsg1=driver.getCurrentUrl();
	System.out.println(""+actualmsg1);
	validatemsg(actualmsg1,"https://login.xero.com/");
	endreport();
	
}
public static void TestID01B() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero1B.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero1B");
	Thread.sleep(3000);
	WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
	clickObj(loginbutton,"login");
	String actualmsg=driver.getTitle();
	System.out.println(""+actualmsg);
	validatemsg(actualmsg,"Login | Xero Accounting Software");
	WebElement username=FindElement(By.id("email"),"username");
	enterText(username,"bindukonda89@gmail.com", "username");
	
	WebElement password=FindElement(By.id("password"),"Password");
	enterText(password,"Password","Password");
	WebElement login=FindElement(By.id("submitButton"),"login");
	
	clickObj(login,"login");
	Thread.sleep(3000);
	WebElement errormsg=FindElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"),"error");
	System.out.println(errormsg.getText());
	String actualmsg1=errormsg.getText();
	String errormsg2 ="Your email or password is incorrect";
	validatemsg(actualmsg1,errormsg2);
     endreport();
	
}

public static void TestID01C() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero1C.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero1C");
	Thread.sleep(3000);
	WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
	clickObj(loginbutton,"login");
	String actualmsg=driver.getTitle();
	System.out.println(""+actualmsg);
	validatemsg(actualmsg,"Login | Xero Accounting Software");
	WebElement username=FindElement(By.id("email"),"username");
	enterText(username,"abcd@gmail.com", "username");
	
	WebElement password=FindElement(By.id("password"),"Password");
	enterText(password,"Password89","Password");
	WebElement login=FindElement(By.id("submitButton"),"login");
	
	clickObj(login,"login");
	Thread.sleep(3000);
	WebElement errormsg=FindElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"),"error");
	System.out.println(errormsg.getText());
	String actualmsg1=errormsg.getText();
	String errormsg2 ="Your email or password is incorrect";
	validatemsg(actualmsg1,errormsg2);
     endreport();
}
public static void TestID01D() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero1D.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero1D");
	Thread.sleep(3000);
	WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
	clickObj(loginbutton,"login");
	String actualmsg=driver.getTitle();
	System.out.println(""+actualmsg);
	validatemsg(actualmsg,"Login | Xero Accounting Software");
	
	WebElement forgotpwd=FindElement(By.xpath("//a[@class='forgot-password-advert']"),"forgotpwd");
	
	clickObj(forgotpwd,"login");
	Thread.sleep(3000);
	WebElement errormsg=FindElement(By.xpath("//p[contains(text(),'To reset your password, enter the email address yo')]"),"error");
	System.out.println(errormsg.getText());
	String actualmsg1=errormsg.getText();
	String errormsg2 ="To reset your password, enter the email address you use to login to Xero. A link will be emailed to this address which will let you reset your password.";
	validatemsg(actualmsg1,errormsg2);
     endreport();
}
public static void TestID02A() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero2A.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero2A");
	Thread.sleep(3000);
	WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
	clickObj(trial,"freetrial");
	WebElement firstname=FindElement(By.xpath("//input[@name='FirstName']"),"firstname");
	enterText(firstname,"BINDU","firstname");
	WebElement lastname=FindElement(By.name("LastName"),"lastname");
	enterText(lastname,"KONDA","lastname");
	WebElement email=FindElement(By.name("EmailAddress"),"email");
	enterText(email,"bindukonda89@gmail.com","email");
	WebElement country=FindElement(By.name("LocationCode"),"country");
	SelectByValue(country,"United States");
	WebElement phonenumber=FindElement(By.name("PhoneNumber"),"phonenumber");
	enterText(phonenumber,"123-456-7890","phonenumber");
	WebElement acceptterms=FindElement(By.name("TermsAccepted"),"acceptterms");
	clickObj(acceptterms,"acceptterms");
	WebElement getstarted=FindElement(By.xpath("//span[@class='g-recaptcha-submit']"),"getstarted");
	clickObj(getstarted,"getstarted");
	System.out.println("Inbox page is displayed.");
	endreport();
}
public static void TestID02B() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero2B.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero2B");
	Thread.sleep(3000);
	WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
	clickObj(trial,"freetrial");
	WebElement getstarted=FindElement(By.xpath("//span[@class='g-recaptcha-submit']"),"getstarted");
	clickObj(getstarted,"getstarted");
	WebElement errormsgfirstname=FindElement(By.id("signup-form-error-message-1"),"errormsgfirstname");
	String actualmsg1=errormsgfirstname.getText();
	validatemsg(actualmsg1,"First name can't be empty");
	WebElement errormsglastname=FindElement(By.id("signup-form-error-message-2"),"errormsglastname");
	String actualmsg2=errormsglastname.getText();
	validatemsg(actualmsg2,"Last name can't be empty");
	WebElement errormsgemail=FindElement(By.id("signup-form-error-message-3"),"errormsgemail");
	String actualmsg3=errormsgemail.getText();
	validatemsg(actualmsg3,"Email address can't be empty");
	WebElement errormsgphonenumber=FindElement(By.id("signup-form-error-message-4"),"errormsgphonenumber");
	String actualmsg4=errormsgphonenumber.getText();
	validatemsg(actualmsg4,"Phone number can't be empty");
	WebElement email=FindElement(By.name("EmailAddress"),"email");
	enterText(email,"bindugmail.com","email");
	WebElement getstarted2=FindElement(By.xpath("//span[@class='g-recaptcha-submit']"),"getstarted");
	clickObj(getstarted2,"getstarted");
	WebElement errormsgemail1=FindElement(By.id("signup-form-error-message-3"),"errormsgemail");
	String actualmsg5=errormsgemail1.getText();
	validatemsg(actualmsg5,"Email address is invalid");
	WebElement terms=FindElement(By.name("TermsAccepted"),"terms");
	//String actualmsg6=terms.getText();
	System.out.println("I have read and I agree to the terms of use, privacy notice and offer details is highlighted");
	//validatemsg(actualmsg6,"I have read and I agree to the terms of use, privacy notice and offer details");
	endreport();
	}
public static void TestID02C() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero2C.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero2C");
	Thread.sleep(3000);
	WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
	clickObj(trial,"freetrial");
	
	
	
	
	WebElement termsofuse=FindElement(By.xpath("//a[contains(text(),'terms of use')]"),"terms of use");
	clickObj(termsofuse,"terms of use");
	
	Set<String>getAllWindows=driver.getWindowHandles();
	String[] getwin=getAllWindows.toArray(new String[getAllWindows.size()]);
	System.out.println(getAllWindows.size());
	driver.switchTo().window(getwin[1]);
	
	String termsurl=driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	validatemsg(termsurl,"https://www.xero.com/us/about/terms/");
	
	
	driver.switchTo().window(getwin[0]);
	WebElement privacy=FindElement(By.xpath("//a[contains(text(),'privacy notice')]"),"privacy");
	clickObj(privacy,"privacy");
	Set<String>getAllWindows1=driver.getWindowHandles();
	String[] getwin1=getAllWindows.toArray(new String[getAllWindows.size()]);
	System.out.println(getAllWindows.size());
	driver.switchTo().window(getwin[2]);
	
	
	
	//driver.switchTo().window(getwin[1]);
	String privacyurl=driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	endreport();
}
public static void TestID02D() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero2D.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero2D");
	Thread.sleep(3000);
	WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
	clickObj(trial,"freetrial");
	WebElement fulloffers=FindElement(By.xpath("//a[contains(text(),'offer details')]"),"fulloffers");
	clickObj(fulloffers,"fulloffers");
	Thread.sleep(3000);
	
	Set<String>getAllWindows=driver.getWindowHandles();
	String[] getwin=getAllWindows.toArray(new String[getAllWindows.size()]);
	System.out.println(getAllWindows.size());
	driver.switchTo().window(getwin[1]);
	String actualmsg6=driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	validatemsg(actualmsg6,"https://www.xero.com/us/signup/offer-details/");
	endreport();
	driver.quit();
	}
public static void TestID02E() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero2E.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero2E");
	Thread.sleep(3000);
	WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
	clickObj(trial,"freetrial");
	WebElement accountantandbookkeeper=FindElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"),"accountantandbookkeeper");
	clickObj(accountantandbookkeeper,"accountantandbookkeeper");
	//h2[@class='title title-2']
	String actualmsg=driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	
		validatemsg(actualmsg,"https://www.xero.com/us/partner-programs/partners/signup/");
	endreport();
	driver.quit();
}
public static void TestID03A() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero3A.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero3A");
	Thread.sleep(3000);
	WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
	clickObj(loginbutton,"login");
	String actualmsg=driver.getTitle();
	System.out.println(""+actualmsg);
	validatemsg(actualmsg,"Login | Xero Accounting Software");
	WebElement username=FindElement(By.id("email"),"username");
	enterText(username,"bindukonda89@gmail.com", "username");
	
	WebElement password=FindElement(By.id("password"),"Password");
	enterText(password,"Password89","Password");
	WebElement login=FindElement(By.id("login"),"login");
	clickObj(login,"login");
	
	
	
	//WebElement usingtrial=FindElement(By.id("xrh-header-container"),"usingtrail");
	//System.out.println(usingtrial.getText());
	//String actualmsg1=driver.getCurrentUrl();
	//System.out.println(""+actualmsg1);
	//validatemsg(actualmsg1,"https://login.xero.com/");
	
	
	//WebElement dashboard=FindElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"),"dashboard");
	//clickObj(dashboard,"dashboard");
	//String dashboardurl=driver.getCurrentUrl();
   // System.out.println(driver.getCurrentUrl());
	
	Thread.sleep (3000);
    WebElement accounting=FindElement(By.xpath("//button[contains(text(),'Accounting')]"),"accounting");
    clickObj(accounting,"accounting");
   // String accounturl=driver.getCurrentUrl();
   // System.out.println(driver.getCurrentUrl());
   // WebElement accountingreports=FindElement(By.id("accounting-reports"),"accounting-reports");
   // clickObj(accountingreports,"accounting-reports");
     String reporturl=driver.getCurrentUrl();
    System.out.println(driver.getCurrentUrl()); 
    endreport();
}

public static void TestID04A() throws InterruptedException {
	initialize_driver();
	String path ="C:\\data\\xeroexterneport\\xero4A.html";
	testpath(path);
	launchurl("https://www.xero.com/us/","xero4A");
	Thread.sleep(3000);
	WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
	clickObj(loginbutton,"login");
	String actualmsg=driver.getTitle();
	System.out.println(""+actualmsg);
	validatemsg(actualmsg,"Login | Xero Accounting Software");
	WebElement username=FindElement(By.id("email"),"username");
	enterText(username,"bindukonda89@gmail.com", "username");
	WebElement password=FindElement(By.id("password"),"Password");
	enterText(password,"Password89","Password");
	WebElement login=FindElement(By.id("login"),"login");
	clickObj(login,"login");
	Thread.sleep(3000);
    WebElement userMenu=FindElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-9']"),"usermenu");
    clickObj(userMenu,"usermenu");
   
    WebElement logout=FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]  "),"Logout");
    clickObj(logout,"Logout");
    Thread.sleep(3000);
    WebElement name=FindElement(By.id("email"),"Username");
    String actual=name.getText();
    System.out.println(""+actual);
    String expected="bindukonda89@gmail.com";
    validatemsg(actual,expected);
    endreport();

}}