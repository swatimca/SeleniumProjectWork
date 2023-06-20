package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);

	}

//Elements
	@FindBy(xpath="//span[contains(text(),'Hello, sign in')]")
	WebElement Homeclick;
	
	@FindBy(id = "ap_email")
	WebElement txtUname;

	@FindBy(id = "continue")
	WebElement BtnContinue;

	@FindBy(name = "password")
	WebElement txtpwd;

	@FindBy(id = "signInSubmit")
	WebElement Btnsubmit;

	public void uname(String email) {
		txtUname.sendKeys(email);
	}

	public void btncon() {
		BtnContinue.click();
	}
public void HClick()
{
	Homeclick.click();
}
	public void pwd(String Password) {
		txtpwd.sendKeys(Password);
	}

	public void btnlog() {
		Btnsubmit.click();
	}
}
