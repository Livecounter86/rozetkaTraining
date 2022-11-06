package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends ParentPage{

    public void checkItemWasAdded(){
        $(By.xpath(".//li/rz-cart-product/div/div[1]/div/a")).shouldHave(Condition.text("Kingston SSDNow A400 240GB 2.5\" SATAIII 3D TLC (SA400S37/240G)"));
    }
}
