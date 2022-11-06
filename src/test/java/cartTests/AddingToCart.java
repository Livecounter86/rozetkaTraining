package cartTests;


import BaseActions.BaseActions;
import org.junit.Test;

public class AddingToCart extends BaseActions {

    @Test
    public void AddToCartFirstPosition(){
        mainPage.openMainPage();
        mainPage.clickOnFirstPositionMainPage();
        itemPage.clickOnBuyButton();
        itemPage.goToCart();
        cartPage.checkItemWasAdded();

    }
}
