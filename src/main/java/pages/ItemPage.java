package pages;

public class ItemPage extends ParentPage{
    public void clickOnBuyButton(){
        clickOnElement(".//rz-product-buy-btn/app-buy-button");
    }

    public void goToCart(){
        clickOnElement(".//rz-cart/button");
    }
}
