package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.interactions.OpenTheBrowser;
import com.demoqa.automation.questions.ValidationsFormsdemoqa;
import com.demoqa.automation.tasks.FormesDemoqaValidationsTasks;
import com.demoqa.automation.tasks.FormsDemoqaTasks;
import com.demoqa.automation.ui.FormsDemoqaPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class FormsDemoqaStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("john").can(BrowseTheWeb.with(driver));
    }
    @Given("^on the page of demoqa$")
    public void onThePageOfDemoqa() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FormsDemoqaPage.URL));
    }


    @When("^enter all your dada in form$")
    public void enterAllYourDadaInForm() {
        theActorInTheSpotlight().attemptsTo(FormsDemoqaTasks.data());
    }

    @Then("^you should see a table with data$")
    public void youShouldSeeATableWithData() {
        theActorInTheSpotlight().attemptsTo(FormesDemoqaValidationsTasks.validations());
    }
}
