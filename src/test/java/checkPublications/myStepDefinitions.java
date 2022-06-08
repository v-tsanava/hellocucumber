package checkPublications;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

class checkPublications{
        static String showPublication(String publications) {
            return "publication";
        }
}
class clickButton{
    static String clickButton(String buttonName) {
        return "OK";
    }
}

public class myStepDefinitions {

    private Boolean havePublications;
    private String openProfile;
    private String publications;
    private String myProfile;
    private String result;

    @Given("Authorised user have a publication")
    public void authorised_user_have_a_publication() {
        havePublications = true;
    }

    @When("He click the button myProfile")
    public void he_click_the_button_my_profile() {
        openProfile = clickButton.clickButton(myProfile);
    }

    @Then("He see profile page with his publication")
    public void he_see_profile_page_with_his_publication() {
        if (havePublications = true) {
            result = checkPublications.showPublication(publications);
        }
    }
}

