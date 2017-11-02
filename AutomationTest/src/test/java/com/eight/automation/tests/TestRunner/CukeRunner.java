package com.eight.automation.tests.TestRunner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by venpatis on 27/10/2017.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/java/com/eight/automation/tests/FeatureFiles/"},
        glue={"com/eight/automation/tests/StepDefinitions"},
        tags={"@AmazonOrder"}
)

public class CukeRunner  {

}

