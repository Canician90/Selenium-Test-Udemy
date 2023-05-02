package search;

import org.example.AppConfig;
import org.example.TestBASE;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import webviews.Header;
import webviews.ProductsGrid;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleSearchTest extends TestBASE {


    @Test
    public void simpleSearchWithOneKeyword() {
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());


        WebDriver driver = new ChromeDriver();

        driver.get(AppConfig.getSiteUrl());

        Header header = PageFactory.initElements(driver, Header.class);
        String searchKeyword = "vase";


        header.getSearch(searchKeyword);
        // $x("//div[@class='product-info']//button[@title='Add to Cart']");
        //$x("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']");

        //driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']")).click();

        System.out.println("Pressed Enter in search field");

        ProductsGrid productsGrid = PageFactory.initElements(driver, ProductsGrid.class));


        System.out.println("Stored" + productsGrid.getProductNames().size() + "product names");

        for (Object productName : productsGrid.getProductNames()) {
            assertThat("Some of the products name do not contain in the searched keyword",
                    productName.getText(), containsString(searchKeyword.toUpperCase()));

        }
    }
}
