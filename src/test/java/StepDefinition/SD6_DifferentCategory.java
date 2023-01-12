package StepDefinition;

import Pages.P6_DifferentCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SD6_DifferentCategory {
    P6_DifferentCategoryPage Category = new P6_DifferentCategoryPage();

    @When("user select Computer categories")
    public void ComputerCategory() {
        Category.Computercategory();
    }

    @And("user select a Electronics categories then hover to camera and photo subcategory")
    public void SubCategory() {
        Category.SubCategory();
    }


    @And("user choose Gift Cards categories")
    public void CardCategory() {
        Category.CardCategory();
    }


}
