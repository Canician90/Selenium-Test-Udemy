package webviews;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {
    @FindBy(id ="search")
    private WebElement searchField

    public WebElement getSearhField() {
        return searchField;
    }



    }
    pulic void search (String keyword) {
        searchField.sendKeys(keyword + Keys.ENTER);

}
}
