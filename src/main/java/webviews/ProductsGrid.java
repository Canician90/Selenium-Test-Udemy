package webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsGrid {
    @FindBy (css ="h2.product-name a")
    List<WebElement> productNames;

    public WebElement getProductNames() {
        return null;
    }
}
