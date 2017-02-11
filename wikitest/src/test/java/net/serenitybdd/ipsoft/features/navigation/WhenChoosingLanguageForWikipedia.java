package net.serenitybdd.ipsoft.features.navigation;

import net.serenitybdd.ipsoft.model.SiteLanguage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import net.serenitybdd.ipsoft.steps.WikipediaUser;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Viraj on 2/8/17.
 */
@RunWith(SerenityRunner.class)
public class WhenChoosingLanguageForWikipedia {

    @Steps
    WikipediaUser user;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToVisitEnglishWikipedia(){
        // Start
        user.isOnHomePage();

        // When
        user.choosesLanguage(SiteLanguage.English);

        // Then
        user.shouldSeePageSaying("Welcome to Wikipedia");
    }
}
