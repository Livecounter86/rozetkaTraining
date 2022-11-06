package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends ParentPage{

    @FindBy(xpath = ".//section[2]//ul/li[1]/rz-app-tile//a[@class='tile__title']")
    private WebElement firstGross;


    public void openMainPage(){
        open("https://rozetka.com.ua/");
    }
    public void clickOnFirstPositionMainPage(){
        $(By.xpath(".//rz-goods-sections//ul/li[1]/rz-app-tile/div/div/a[2]")).click();
    }
}
