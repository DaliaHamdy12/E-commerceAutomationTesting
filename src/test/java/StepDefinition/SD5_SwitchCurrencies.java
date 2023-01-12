package StepDefinition;

import Pages.P5_SwitchCurrenciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SD5_SwitchCurrencies {
    P5_SwitchCurrenciesPage Currencies = new P5_SwitchCurrenciesPage();
   /* @Given("user navigate to home")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        Mouse.driver.navigate() .to(url);
    }*/
    @When("logged user choose Euro from dropdown menu")
    public void Euro() {
        Currencies.Euro();
    }
    @Then("user choose Euro successfully")
    public void success_Euro() {
        String ExpectedResult = "Euro";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @And("user choose US Dollar from dropdown menu")
    public void USDollar(){
        Currencies.USDollar();

    }
    @Then("user choose US Dollar successfully")
    public void success_US() {
        String ExpectedResult = "US Dollar";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }

}


