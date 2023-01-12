package StepDefinition;

import Pages.P91_CompareListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class SD91_CompareList {
    P91_CompareListPage compare = new P91_CompareListPage();

    @When("user add Apple MacBook to compare list")
    public void Apple_MacBook() {
        compare.Apple_MacBook().click();
    }

    @And("user click on add to compare list button")
    public void Add_To_compare_List_1() {
        compare.Add_To_compare_List_1().click();
    }

    @Then("success message1")
    public void Success_message1() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your product comparison");
    }
    @When("user add HP Spectre to compare list")

    public void HP_Spectre() {
        compare.HP_Spectre().click();
    }
    @And("user click on add to compare list button_2")
    public void Add_To_compare_List_2() {
        compare.Add_To_compare_List_2().click();
    }
    @Then("success message2")
    public void Success_message2() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
        System.out.println("HP Spectre XT Pro UltraBook: The product has been added to your product comparison");
    }
    @When("user add Lenovo laptop to compare list")
    public void lenovo_Laptop() {
        compare.lenovo_Laptop().click();
    }

    @And("user click on add to compare list button_3")
    public void Add_To_compare_List_3() {

        compare.Add_To_compare_List_3().click();
    }

    @Then("success message3")
    public void Success_message3() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
        System.out.println("Lenovo Thinkpad X1 Carbon Laptop: The product has been added to your product comparison");
    }
}
