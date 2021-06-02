package homepage;
/**
 * ●	Create package homepage
 * ●	Create class TopMenuTest
 * 1 - verifyUserShouldNavigateToShippingPageSuccessfully()
 * 1.1 Click on the “Shipping” link
 * 1.2 Verify the text “Shipping”
 * <p>
 * 2 - verifyUserShouldNavigateToNewPageSuccessfully()
 * 2.1 Click on the “New!” link
 * 2.2 Verify the text “New arrivals”
 * <p>
 * 3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
 * 3.1 Click on the “Coming soon” link
 * 3.2 Verify the text “Coming soon”
 * <p>
 * 4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
 * 4.1 Click on the “Contact us” link
 * 4.2 Verify the text “Contact us”
 */

import browsertesting.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void SetUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
        /** 1.1 Click on the “Shipping” link*/
        Thread.sleep(1000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]"));

        /** 1.2 Verify the text “Shipping”*/
        Thread.sleep(1000);
        String expectedtext1 = "Shipping";
        String actualtext1 = getTextFromElement(By.xpath("//div[@class='list-container']/h1")); ////h1[@id='page-title']
        Assert.assertEquals("Text Shipping is not displayed", expectedtext1, actualtext1);
    }

    @Test
    public void verifyUserShouldNavigateToNewPAgeSuccessfully() throws InterruptedException {
        /** 2.1 Click on the “New!” link*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]"));

        /** 2.2 Verify the text “New arrivals”*/
        Thread.sleep(1000);
        String expectedtext2 = "New arrivals";
        String actualtext2 = getTextFromElement(By.xpath("//div[@class='list-container']/h1")); ////h1[@id='page-title']
        Assert.assertEquals("Text New arrivals is not displayed", expectedtext2, actualtext2);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException {
        /** 3.1 Click on the “Coming soon” link*/
        Thread.sleep(1000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));

        /** 3.2 Verify the text “Coming soon”*/
        Thread.sleep(1000);
        String expectedtext3 = "Coming soon";
        String actualtext3 = getTextFromElement(By.xpath("//div[@class='list-container']/h1")); ////h1[@id='page-title']
        Assert.assertEquals("Text Coming soon is not displayed", expectedtext3, actualtext3);
    }

    @Test
    public void verifyUserShouldNavigateToContactUSPAgeSuccessfully() throws InterruptedException {
        /** 4.1 Click on the “Contact us” link*/
        Thread.sleep(1000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));

        /** 4.2 Verify the text “Contact us”*/
        Thread.sleep(1000);
        String expectedtext4 = "Contact us";
        String actualtext4 = getTextFromElement(By.xpath("//div[@class='list-container']/h1")); //h1[@id='page-title']
        Assert.assertEquals("Text Contact us is not displayed", expectedtext4, actualtext4);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

    }



