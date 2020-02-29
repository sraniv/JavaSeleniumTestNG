package com.optus.homepage;

import org.testng.annotations.Test;
import framework.core.BaseTest;
import rima.pageobjects.homepage.GoogleHomepage;

public class GoogleHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
    }
}
