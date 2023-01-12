package StepDefinition;

import Pages.P8_DifferentTagsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SD8_DifferentTags {
    P8_DifferentTagsPage Tags = new P8_DifferentTagsPage();

    @Given("user click on Electronics")
    public void Electronics() {
        Tags.Electronics().click();
    }

    @When("user select cool from popular tags")
    public void Cool_Tags() {
        Tags.CoolTags();
    }

    @And("user select digital from popular tags")

    public void Digital_Tags() {
        Tags.DigitalTags();
    }

    @And("user select game from popular tags")

    public void Game_Tags() {
        Tags.GameTags();
    }

    @And("user select computer from popular tags")
    public void Computer_Tags() {
        Tags.ComputerTags();
    }
}
