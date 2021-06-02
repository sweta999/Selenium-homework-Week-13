package shopping;

/**
 * 1.1 Mouse hover on the “Hot deals” link
 * 1.2 Mouse hover on the “Sale”  link and click
 * 1.3 Verify the text “Sale”
 * 1.4 Mouse hover on “Sort By” and select “Name A-Z”
 * 1.5 Click on “Add to cart” button of the product Avengers-Fabrikations Plush“
 * 1.6 Verify the message “Product has been added to your cart” display in  green bar
 * 1.7 Click on X sign to close the message
 * 1.8 Click on “Your cart” icon and Click on “View cart” button
 * 1.9 Verify the text “Your shopping cart - 1 item”
 * 1.10 Change the Qty = 2
 * 1.11 Verify the text “Your shopping cart - 2 items”
 * 1.12 Verify the Subtotal $29.98
 * 1.13 Verify the total $36.00
 * 1.14 Click on “Go to checkout” button
 * 1.15 Verify the text “Log in to your account”
 * 1.16 Enter Email address
 * 1.17 Click on “Continue” Button
 * 1.18 Verify the text “Secure Checkout”
 * 1.19 Fill all the mandatory fields
 * 1.20 Check the check box “Create an account for later use”
 * 1.21 Enter the password
 * 1.22 Select the Delivery Method to “Local Shipping”
 * 1.23 Select Payment Method “COD”
 * 1.24 Verify the total $37.03
 * 1.25 Click on “Place Order” Button
 * 1.26 Verify the text “Thank you for your order”
 * <p>
 * 2- verifyThatUserShouldClearShoppingCartSuccessfully()
 * 2.1 Mouse hover on the “Hot deals” link
 * 2.2 Mouse hover on the “Bestseller”  link and click
 * 2.3 Verify the text “Bestsellers”
 * 2.4 Mouse hover on “Sort By” and select “Name A-Z”
 * 2.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
 * 2.6 Verify the message “Product has been added to your cart” display in  green bar
 * 2.7 Click on X sign to close the message
 * 2.8 Click on “Your cart” icon and Click on “View cart” button
 * 2.9 Verify the text “Your shopping cart - 1 item”
 * 2.10 Click on “Empty your cart” link
 * 2.11 Verify the text “Are you sure you want to clear your cart?” on alert
 * 2.12 Click “Ok” on alert
 * 2.13 Verify the message “Item(s) deleted from your cart”
 * 2.15 Verify the text “Your cart is empty”
 */


import browsertesting.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;

public class ShoppingTest extends BaseTest {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void SetUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        /** 1.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 1.2 Mouse hover on the “Sale”  link and click*/
        Thread.sleep(5000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]"));

        /** 1.3 Verify the text “Sale”*/
        Thread.sleep(5000);
        String expectedtext1 = "Sale";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Sale does not occur", expectedtext1, actualtext1);

        /** 1.4 Mouse hover on “Sort By” and select “Name A-Z”*/
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[5]/a"));

        /** 1.5 Click on “Add to cart” button of the product Avengers-Fabrikations Plush*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-16']/span"));

        /** 1.6 Verify the message “Product has been added to your cart” display in  green bar*/
        Thread.sleep(5000);
        String expectedtext2 = "Product has been added to your cart";
        String actualtext2 = getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        Assert.assertEquals("Message 'Product has been added to your cart' does not display", expectedtext2, actualtext2);

        /** 1.7 Click on X sign to close the message*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//div[@id='status-messages']/a"));

        /** 1.8 Click on “Your cart” icon and Click on “View cart” button*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//div[@title='Your cart']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        /** 1.9 Verify the text “Your shopping cart - 1 item”*/
        Thread.sleep(5000);
        String expectedtext3 = "Your shopping cart - 1 item";
        String actualtext3 = getTextFromElement(By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]"));
        Assert.assertEquals("Text 'Your shopping cart - 1 item' is not displayed", expectedtext3, actualtext3);

        /** 1.10 Change the Qty = 2 */
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='amount16']")).clear();
        sendTextToElement(By.xpath("//input[@id='amount16']"), "2");

        /** * 1.11 Verify the text “Your shopping cart - 2 items” */
        Thread.sleep(5000);
        String expectedtext4 = "Your shopping cart - 2 items";
        String actualtext4 = getTextFromElement(By.xpath("//h1[contains(text(),'Your shopping cart - 2 items')]"));
        Assert.assertEquals("Text 'Your shopping cart - 2 item' is not displayed", expectedtext4, actualtext4);

        /** 1.12 Verify the Subtotal $29.98 */
        Thread.sleep(5000);
        String expectedSubtotal = "$29.98";
        String actualSubtotal = getTextFromElement(By.xpath("//ul[@class='sums']/li/span"));
        Assert.assertEquals("Subtotal: $29.98' is not displayed", expectedSubtotal, actualSubtotal);

        /** 1.13 Verify the total $36.00 */
        Thread.sleep(5000);
        String expectedtotal = "$36.00";
        String actualtotal = getTextFromElement(By.xpath("//li[@class='total']/span/span[1]"));
        Assert.assertEquals("Total: $36.00' is not displayed", expectedtotal, actualtotal);

        /** 1.14 Click on “Go to checkout” button */
        Thread.sleep(5000);
        clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"));

        /** 1.15 Verify the text “Log in to your account”*/
        Thread.sleep(5000);
        String expectedtext5 = "Log in to your account";
        String actualtext5 = getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        Assert.assertEquals("Text 'Log in to your account' is not displayed", expectedtext5, actualtext5);

        /** 1.16 Enter Email address*/
        Thread.sleep(5000);
        sendTextToElement(By.xpath("//input[@id='email']"), "nimmo@gmail.com");//lmo@gmail.com

        /** 1.17 Click on “Continue” Button*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));

        /** 1.18 Verify the text “Secure Checkout”*/
        Thread.sleep(5000);
        String expectedtext6 = "Secure Checkout";
        String actualtext6 = getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));//h1[@class='title']/span
        Assert.assertEquals("Text 'Secure Checkout' is not displayed", expectedtext6, actualtext6);

        /** 1.19 Fill all the mandatory fields*/
        Thread.sleep(5000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"), "limo");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"), "nimmo");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"), "12 ka 4, paradise way");
        //sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"),"London");
        //selectByValueFromDropDown(By.xpath("//select[@id='shippingaddress-country-code']"),"United Kingdom");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"), "abc");
        //sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"),"90002");

        /** 1.20 Check the check box “Create an account for later use”*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//input[@id='create_profile']"));

        /** 1.21 Enter the password*/
        Thread.sleep(5000);
        sendTextToElement(By.xpath("//input[@id='password']"), "nimmo124");

        /** 1.22 Select the Delivery Method to “Local Shipping”*/
        Thread.sleep(5000);
        mouseHoverToElementAndClick(By.xpath("//span[contains(text(),'Local shipping')]"));
        //clickOnElement(By.xpath("//input[@id='method128']"));
        //div[@class='radio']/label[@title='Local shipping']/input

        /** 1.23 Select Payment Method “COD”*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//div[@class='radio']/label/input[@id='pmethod6']"));//input[@id='pmethod6']

        /** 1.24 Verify the total $37.03*/
        Thread.sleep(5000);
        String expectedtotal1 = "$37.03";
        String actualtotal1 = getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]"));
        Assert.assertEquals("Total '$37.03' is not displayed", expectedtext6, actualtext6);

        /** 1.25 Click on “Place Order” Button*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//span[contains(text(),'Place order: $37.03')]"));

        /** 1.26 Verify the text “Thank you for your order”*/
        Thread.sleep(5000);
        String expectedtext7 = "Thank you for your order";
        String actualtext7 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text 'Thank you for your order' is not displayed", expectedtext7, actualtext7);

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        /** 2.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 2.2 Mouse hover on the “Bestsellers”  link and click*/
        Thread.sleep(10000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        /** 2.3 Verify the text “Bestsellers”*/
        Thread.sleep(3000);
        String expectedtext1 = "Bestsellers";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Bestseller does not occur", expectedtext1,actualtext1);

        /** 2.4 Mouse hover on “Sort By” and select “Name A-Z”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));//span[contains(text(),'Sort by:')]
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[4]/a"));

        /** 2.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”*/
        Thread.sleep(3000);
        mouseHoverToElementAndClick(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"));

        /** 2.6 Verify the message “Product has been added to your cart” display in  green bar*/
        Thread.sleep(5000);
        String expectedtext2 = "Product has been added to your cart";
        String actualtext2 = getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        Assert.assertEquals("Message 'Product has been added to your cart' does not display", expectedtext2, actualtext2);

        /** 2.7 Click on X sign to close the message*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//div[@id='status-messages']/a"));

        /** 2.8 Click on “Your cart” icon and Click on “View cart” button*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//div[@title='Your cart']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        /** 2.9 Verify the text “Your shopping cart - 1 item”*/
        Thread.sleep(5000);
        String expectedtext3 = "Your shopping cart - 1 item";
        String actualtext3 = getTextFromElement(By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]"));
        Assert.assertEquals("Text 'Your shopping cart - 1 item' is not displayed", expectedtext3, actualtext3);

        /** 2.10 Click on “Empty your cart” link*/
        Thread.sleep(5000);
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));

        /** 2.11 Verify the text “Are you sure you want to clear your cart?” on alert*/
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();  //switch to alert
        String alertMessage = driver.switchTo().alert().getText(); // capture alert message
        String expectedMessage = "Are you sure you want to clear your cart?";
        Assert.assertEquals("Alert message is not same", expectedMessage,alertMessage);
        //System.out.println(alertMessage); // print alert message

        /** 2.12 Click “Ok” on alert*/
        Thread.sleep(5000);
        alert.accept();

        /** 2.13 Verify the message “Item(s) deleted from your cart”*/

        /** 2.14 Verify the text “Your cart is empty”*/
        String expectedtext4 = "Your cart is empty";
        String actualtext4 = getTextFromElement(By.xpath("//h1[contains(text(),'Your cart is empty')]"));
        Assert.assertEquals("Text 'Your cart is empty' is not displayed", expectedtext3, actualtext3);

    }


}
