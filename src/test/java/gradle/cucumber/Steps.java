package gradle.cucumber;

import com.kish.learning.bdd.FizzBizzGame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {

    FizzBizzGame fizzBizzGame = new FizzBizzGame();

    private String result;

    @Given("^A user provide a number which is (\\d+)$")
    public void givenAnumberMulitple(int arg0){
        result = fizzBizzGame.fizzbizzDecider(arg0);
    }

    @Then("The result should be {string}")
    public void theResultShouldBe(String arg0) {
        assert result.equals(arg0);
    }
}
