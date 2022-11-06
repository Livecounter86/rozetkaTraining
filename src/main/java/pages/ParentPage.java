package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

abstract public class ParentPage {

    protected void clickOnElement(String element){
        $(By.xpath(element)).click();
    }
}
