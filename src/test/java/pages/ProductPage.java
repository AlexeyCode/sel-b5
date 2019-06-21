package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//select[@name=\"options[Size]\"]")
    WebElement selectProductSize;

    @FindBy(xpath = "//button[@name=\"add_cart_product\"]")
    WebElement addToCartButton;


    void useSelectSizeIfPresent(String size){
        try {
            if (selectProductSize.isDisplayed()) {
                Select select = new Select(selectProductSize);
                select.selectByVisibleText(size);
            }
        }catch (Exception e){}
    }







}
