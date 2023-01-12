package StepDefinition;

import Pages.P2_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SD2_Login {
    P2_LoginPage log = new P2_LoginPage();


  /*  @Given("user navigate to home page")
    public void Navigate_Home()
    {
        // String url = "https://demo.nopcommerce.com/";
        Mouse.driver.navigate().to("https://demo.nopcommerce.com/");
    }*/
    @And("user click on login link")
    public void Login_Link()
    {

        log.LoginLink().click();
    }
    @And("user enter valid email and password")
    public void Customer()
    {
        log.Email().sendKeys("DaliaHamdy@gmail.com");
        log.Password().sendKeys("P@ssw0rd");

    }

    @And("user click on login button")
    public void Login_button()
    {
        log.LoginBTN().click();
    }


    @Then("user logged in successfully")
    public void successMsg () throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("https://demo.nopcommerce.com/", Mouse.driver.getCurrentUrl());
    }
}
