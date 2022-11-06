package BaseActions;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import pages.CartPage;
import pages.ItemPage;
import pages.MainPage;

public class BaseActions {
    protected MainPage mainPage;
    protected ItemPage itemPage;
    protected CartPage cartPage;

    //WebDriver driver;

    @Before
    public void startTest(){
        mainPage = new MainPage();
        Configuration.browserSize= "1920x1080";
        itemPage = new ItemPage();
        cartPage = new CartPage();


       // driver.manage().window().maximize();
    }

}
