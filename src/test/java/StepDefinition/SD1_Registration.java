package StepDefinition;

import Pages.P1_RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;



public class SD1_Registration {
    P1_RegistrationPage register = new P1_RegistrationPage();


    @Given("user navigate to home page")
    public void Navigate_Home()
    {
        Mouse.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("user click on register link")
    public void Register_Link()
    {

        register.RegisterLink().click();
    }


    @When("user enter valid data")
    public void Valid_Data()
    {
        register.FirstName().sendKeys("Dalia");
        register.LastName().sendKeys("Hamdy");
        register.Email().sendKeys("DaliaHamdy@gmail.com");
        register.Password().sendKeys("P@ssw0rd");
        register.ConfirmPassword().sendKeys("P@ssw0rd");




    }

    @And("user click on register button")
    public void Register_Button() {
        register.RegisterBTN().click();
    }

    @Then("success message is displayed")
    public void Success_Message()
    {
        String expectedResult = "Your registration completed";
        String actualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", Mouse.driver.getCurrentUrl());


    }
}
