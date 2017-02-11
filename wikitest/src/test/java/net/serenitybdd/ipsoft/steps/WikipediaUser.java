package net.serenitybdd.ipsoft.steps;

import net.serenitybdd.ipsoft.model.SiteLanguage;
import net.serenitybdd.ipsoft.ui.CurrentPage;
import net.serenitybdd.ipsoft.ui.LanguageNavigationControl;
import net.serenitybdd.ipsoft.ui.WikipediaHomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Viraj on 2/8/17.
 */
public class WikipediaUser {

    WikipediaHomePage wikipediaHomePage;
    CurrentPage currentPage;
    LanguageNavigationControl languageNavigationControl;

    @Step
    public void isOnHomePage() {
        wikipediaHomePage.open();
    }

    @Step
    public void shouldSeePageSaying(String expectedTitle) {
        assertThat(currentPage.find(By.id("mp-topbanner")).getText()).contains(expectedTitle);
    }

    @Step
    public void choosesLanguage(SiteLanguage language) {
        languageNavigationControl.selectLanguage(language);
    }
}
