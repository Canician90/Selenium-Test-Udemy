package search;

import org.example.AppConfig;
import org.example.TestBASE;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleSearchTest extends TestBASE {


    @Test
    public void simpleSearchWithOneKeyword() {
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());


        WebDriver driver = new ChromeDriver();

        driver.get(AppConfig.getSiteUrl());
        String searchKeyword = "vase";


        driver.findElement(By.id("search")).sendKeys(searchKeyword+ Keys.ENTER);
        // $x("//div[@class='product-info']//button[@title='Add to Cart']");
        //$x("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']");

        //driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']")).click();

        System.out.println("Pressed Enter in search field");

        List<WebElement> productNames = driver.findElements(By.cssSelector("h2.product-name > a"));
        // orice descendent fara ">"

        System.out.println("Stored" + productNames.size() + "product names");

        for (WebElement productName : productNames) {
            assertThat("Some of the products name do not contain in the searched keyword",
                    productName.getText(), containsString(searchKeyword.toUpperCase()));

        }
    }
}
