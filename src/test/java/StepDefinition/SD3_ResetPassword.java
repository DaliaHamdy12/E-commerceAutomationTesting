package StepDefinition;

import Pages.P3_ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SD3_ResetPassword {
    P3_ResetPasswordPage Reset = new P3_ResetPasswordPage();

    @Given("user navigate to login page")
    public void Navigate_Home()
    {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Mouse.driver.navigate().to(url);
    }
    @And("user click on forget password link")
    public void Forget_Password()
    {
        Reset.ForgetPassword().click();
    }
    @When("user fills his Email")
    public void Email()
    {
        Reset.Email().sendKeys("DaliaHamdy@gmail.com");
    }
    @And("user click on Recover button")
    public void RecoverBTN()
    {
        Reset.RecoverBTN().click();
    }
    @Then("A message is Displayed to user")
    public void Displayed_Message()
    {
        String ExpectedResult = "Email with instructions has been sent to you.";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
        System.out.println("Password Recovery Message: Email with instructions has been sent to you.");
    }


}
