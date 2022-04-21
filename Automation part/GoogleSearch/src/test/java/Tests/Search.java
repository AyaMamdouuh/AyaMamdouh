package Tests;
import Base.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class Search extends Base.base{

@Test(priority=1)
    public void searchUsingValidTextInArabic(Method method) throws InterruptedException {
    google.search=new Pages.Search(driver);
    google.search.enterSearchKey(sheet.getRow(1).getCell(0).toString());
    google.search.clickOnGoogleLogo();
    google.result=google.search.clickOnGoogleSearchBtn();
    Assert.assertEquals(driver.getTitle(),sheet.getRow(1).getCell(1).toString());
}
    @Test(priority=1)
    public void searchUsingValidTextInArabicByClickOnEnter(Method method) throws InterruptedException {
        google.search=new Pages.Search(driver);
        google.search.enterSearchKey(sheet.getRow(1).getCell(0).toString());
        google.result=google.search.clickOnEnterInSearchTextBox();
        Assert.assertEquals(driver.getTitle(),sheet.getRow(1).getCell(1).toString());
    }
    @Test(priority=1)
    public void searchUsingValidTextInEnglish(Method method) throws InterruptedException {
        google.search=new Pages.Search(driver);
        google.search.clickOnLangBTN();
        google.search.enterSearchKey(sheet.getRow(2).getCell(0).toString());
        google.search.clickOnGoogleLogo();
        google.result=google.search.clickOnGoogleSearchBtn();
        Assert.assertEquals(driver.getTitle(),sheet.getRow(2).getCell(1).toString());
    }

    @Test(priority=1)
    public void searchUsingValidTextInEnglishByClickOnEnter(Method method) throws InterruptedException {
        google.search=new Pages.Search(driver);
        google.search.clickOnLangBTN();
        google.search.enterSearchKey(sheet.getRow(2).getCell(0).toString());
        google.result=google.search.clickOnEnterInSearchTextBox();
        Assert.assertEquals(driver.getTitle(),sheet.getRow(2).getCell(1).toString());
    }
    @Test(priority = 2)
    public void searchUsingBlankSearchKey() throws InterruptedException {
        google.search=new Pages.Search(driver);
        google.search.clickOnGoogleSearchBtn();
        Assert.assertEquals(driver.getTitle(),sheet.getRow(3).getCell(1).toString());
    }
    @Test(priority=3)
    public void searchUsingInvalidSearchKey()
    {
        google.search=new Pages.Search(driver);
        google.search.enterSearchKey(sheet.getRow(4).getCell(0).toString());
        google.result=google.search.clickOnEnterInSearchTextBox();
        Assert.assertTrue(google.result.getSearchKeyNotfound().isDisplayed());
    }
}
