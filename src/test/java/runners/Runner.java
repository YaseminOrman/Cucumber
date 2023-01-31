package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome=true,
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false,
        tags = "@failed_tests"
)
public class Runner {
}



/*
 features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
 glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
 dryRun = false //IF dryRun = true. RUN DRY. JUST GIVE ME THE MISSING STEP DEFINITIONS. DON'T RUN THE TEST CASES.
 dryRun= false when we are doing test execution. dryRun=true when we are generation missing step definitions

       ======>>>> REVIEW  ========>>>
    What is cucumber?
    Cucumber is a testing framework. It is a BDD(Behaviour Driven Development) framework.
    BDD means we describe the behavior(functionality) in the feature file first, then write the code
    What is feature file?
    It is used to write test cases in Gherkin language. It has keywords like given, when , then,…This is plane English.
    What is Background?
    It is used for repeated PRE CONDITIONS. This runs before each Scenario keyword.
    What is Scenario:
    It is used to create test cases in feature files. I can use more than 1 scenario keyword in a future file.
    What is Feature:
    This is used to create a feature file. Each feature file must begin with a Feature keyword. They cannot be more than 1 Feature keyword in a feature file
    How do you run specific test cases in cucumber?
    We use runner class to run the test cases. We can run specific test scenarios or feature files using tags.
    What is dryRun in cucumber?
    To generate missing/unimplemented step definitions, we use dryRun=true. When I want to run test cases, I do dryRun=false.
    What is step definition in cucumber?
    Technical codes goes to step definition classes. We write the java code in these classes.
    How do you parametrize the feature files?How do you get the data from the feature file? How do you make the test cases more reusable in cucumber.What is your strategy?
    String “” makes the data dynamic. We can use Scenario Outline, data tables as well
*/

/*
User Story : US167854_manager_login_test
NAME:user should be able to login with manager credentials
AC: Given user is on the home page
When user navigates to the login page
And enter username
And enter password
And click on login button
Then verify the login is successful
ARTIFACT:
url : https://www.bluerentalcars.com/
Credentials:
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {“pam.raymond@bluerentalcars.com","Nga^g6!"}
NOTE: Use scenario outline
 */