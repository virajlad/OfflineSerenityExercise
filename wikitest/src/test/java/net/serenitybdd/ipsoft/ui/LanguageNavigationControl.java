package net.serenitybdd.ipsoft.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.ipsoft.model.SiteLanguage;
import org.openqa.selenium.WebElement;

/**
 * Created by Viraj on 2/10/17.
 */
public class LanguageNavigationControl extends PageObject{

    public void selectLanguage(SiteLanguage language) {
        $("*").find(By.partialLinkText(language.name())).click();
    }
}
