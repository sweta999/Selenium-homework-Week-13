package hotdeals;

import browsertesting.BaseTest;
import com.google.common.base.Verify;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TopLevelElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;

/**
 * - verifySaleProductsArrangeAlphabetically()
 * 1.1 Mouse hover on the “Hot deals” link
 * 1.2 Mouse hover on the “Sale”  link and click
 * 1.3 Verify the text “Sale”
 * 1.4 Mouse hover on “Sort By” and select “Name A-Z”
 * 1.5 Verify that the product arrange alphabetically
 * <p>
 * 2 - verifySaleProductsPriceArrangeLowToHigh()
 * 2.1 Mouse hover on the “Hot deals” link
 * 2.2 Mouse hover on the “Sale”  link and click
 * 2.3 Verify the text “Sale”
 * 2.4 Mouse hover on “Sort By” and select “Price Low-High”
 * 2.5 Verify that the product’s price arrange Low to High
 * <p>
 * 3 - verifySaleProductsArrangeByRates()
 * 3.1 Mouse hover on the “Hot deals” link
 * 3.2 Mouse hover on the “Sale”  link and click
 * 3.3 Verify the text “Sale”
 * 3.4 Mouse hover on “Sort By” and select “Rates”
 * 3.5 Verify that the product’s arrange Rates
 * <p>
 * 4 - verifyBestSellersProductsArrangeByZToA()
 * 4.1 Mouse hover on the “Hot deals” link
 * 4.2 Mouse hover on the “Bestsellers”  link and click
 * 4.3 Verify the text “Bestsellers”
 * 4.4 Mouse hover on “Sort By” and select “Name Z-A”
 * 4.5 Verify that the product arrange by Z to A
 * <p>
 * 5 - verifyBestSellersProductsPriceArrangeHighToLow()
 * 5.1 Mouse hover on the “Hot deals” link
 * 5.2 Mouse hover on the “Bestsellers” link and click
 * 5.3 Verify the text “Bestsellers”
 * 5.4 Mouse hover on “Sort By” and select “Price High-Low”
 * 5.5 Verify that the product’s price arrange High to Low
 * <p>
 * 6 - verifyBestSellersProductsArrangeByRates()
 * 6.1 Mouse hover on the “Hot deals” link
 * 6.2 Mouse hover on the “Bestsellers”  link and click
 * 6.3 Verify the text “Bestsellers”
 * 6.4 Mouse hover on “Sort By” and select “Rates”
 * 6.5 Verify that the product’s arrange Rates
 */


public class HotDealsTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void SetUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        /** 1.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 1.2 Mouse hover on the “Sale”  link and click*/
        Thread.sleep(3000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]"));

        /** 1.3 Verify the text “Sale”*/
        Thread.sleep(3000);
        String expectedtext1 = "Sale";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Sale does not occur", expectedtext1,actualtext1);

        /** 1.4 Mouse hover on “Sort By”and select “Name A -Z”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[5]/a"));

        /** 1.5 Verify that the product arrange alphabetically*/
        Thread.sleep(3000);
        String expectedorderalphabetically = "Name A - Z";
        String actualorderalphabetically = getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        Assert.assertEquals("Product is arrange alphabetically", expectedorderalphabetically,actualorderalphabetically);
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        /** 2.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/span"));

        /** 2.2 Mouse hover on the “Sale”  link and click*/
        Thread.sleep(3000);
        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[1]"));

        /** 2.3 Verify the text “Sale”*/
        Thread.sleep(3000);
        String expectedtext1 = "Sale";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Sale does not occur", expectedtext1,actualtext1);

        /** 2.4 Mouse hover on “Sort By”and select “Price Low-High”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[3]/a"));

        /** 2.5 Verify that the product’s price arrange Low to High*/
        Thread.sleep(3000);
        String expectedlowtohigh = "Price Low - High";
        String actuallowtohigh = getTextFromElement(By.xpath("//span[contains(text(),'Price Low - High')]"));
        Assert.assertEquals("Product is not arrange Low to High", expectedlowtohigh,actuallowtohigh);
    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        /** 3.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 3.2 Mouse hover on the “Sale”  link and click*/
        Thread.sleep(3000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]"));

        /** 3.3 Verify the text “Sale”*/
        Thread.sleep(3000);
        String expectedtext1 = "Sale";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Sale does not occur", expectedtext1,actualtext1);

        /** 3.4 Mouse hover on “Sort By” and select “Rates”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']/li[7]/a"));

        /** 3.5 Verify that the product’s arrange Rates*/
        Thread.sleep(3000);
        String expectedRates = "Rates";
        String actualRates = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
        Assert.assertEquals("Product is not arrange as per Rates", expectedRates,actualRates);
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        /** 4.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 4.2 Mouse hover on the “Bestsellers”  link and click*/
        Thread.sleep(10000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        /** 4.3 Verify the text “Bestsellers”*/
        Thread.sleep(3000);
        String expectedtext1 = "Bestsellers";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Bestseller does not occur", expectedtext1,actualtext1);

       /** 4.4 Mouse hover on “Sort By” and select “Name Z-A”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[5]/a"));

        /** 4.5 Verify that the product arrange by Z to A*/
        Thread.sleep(3000);
        String expectedreversealphabets = "Name Z - A";
        String actualreversealphabets = getTextFromElement(By.xpath("//span[contains(text(),'Name Z - A')]"));
        Assert.assertEquals("Product is not arrange from Z to A", expectedreversealphabets,actualreversealphabets);
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        /** 5.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 5.2 Mouse hover on the “Bestsellers”  link and click*/
        Thread.sleep(3000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        /** 5.3 Verify the text “Bestsellers”*/
        Thread.sleep(3000);
        String expectedtext1 = "Bestsellers";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Bestsellers does not occur", expectedtext1,actualtext1);

        /** 5.4 Mouse hover on “Sort By” and select “Price High-Low”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        clickOnElement(By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[3]/a"));

        /** 5.5 Verify that the product’s price arrange High to Low*/
        Thread.sleep(3000);
        String expectedHighToLow = "Price High - Low";
        String actualHighToLow = getTextFromElement(By.xpath("//span[contains(text(),'Price High - Low')]"));
        Assert.assertEquals("Product is not arrange from High to Low", expectedHighToLow,actualHighToLow);
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        /** 6.1 Mouse hover on the “Hot deals” link*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));

        /** 6.2 Mouse hover on the “Bestsellers”  link and click*/
        Thread.sleep(3000);
        mouseHoverToElementAndClick(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        /** 6.3 Verify the text “Bestsellers”*/
        Thread.sleep(3000);
        String expectedtext1 = "Bestsellers";
        String actualtext1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text Bestseller does not occur", expectedtext1,actualtext1);

        /** 6.4 Mouse hover on “Sort By” and select “Rates”*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverToElementAndClick(By.xpath("//ul[@id='XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1']/li[6]/a"));

        /** 6.5 Verify that the product’s arrange Rates*/
        Thread.sleep(3000);
        String expectedRates = "Rates";
        String actualRates = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
        Assert.assertEquals("Product is not arrange as per Rates", expectedRates,actualRates);

    }


}