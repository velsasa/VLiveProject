package com.tutorialsninja.liveproject.stepdef;

import com.tutorialsninja.liveproject.base.Base;
import io.cucumber.java.en.*;


public class Register {

    @Given("I launch the application")
    public void i_launch_the_application() {

        Base.driver.get(Base.reader.getUrl());

    }

    @And("I navigate to Account Registration page")
    public void i_navigate_to_account_registration_page() {

    }

    @When("I provide all the below valid details")
    public void i_provide_all_the_below_valid_details(io.cucumber.datatable.DataTable dataTable) {

    }

    @And("I select the Privacy Policy")
    public void i_select_the_privacy_policy() {

    }

    @Then("I should see that the User account has successfully created")
    public void i_should_see_that_the_user_account_has_successfully_created() {

    }
}
