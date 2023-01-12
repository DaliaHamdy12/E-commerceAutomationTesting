package StepDefinition;

import Pages.P4_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class SD4_Search {
    P4_SearchPage Search = new P4_SearchPage();

    @When("user click on search field")
    public void Search()
    {
        Search.Search().click();

    }
    @And("user search with name of product")
    public void Search_Product()
    {
        Search.SearchProduct().sendKeys("HTC One");
        Search.SearchBTN().click();
    }
    @Then("user find relative results")
    public void Relative_Result()
    {
        int count = Mouse.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(count);
        Assert.assertTrue(count>0);
        ArrayList<String> products = null;
        products = new ArrayList<String>();
        for (int x = 0 ; x < count ; x++ ){
            System.out.println(Mouse.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
            products.add(Mouse.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
        }
        System.out.println(products);
    }

}
