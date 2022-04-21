package Pages;
import Pages.Result;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Search extends Base.base
{
    @FindBy(name  ="q")
    WebElement searchTextBox;

    @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    WebElement googleSearchBtn;

    @FindBy(xpath="//img[@class='lnXdpd']")
    WebElement googleLogo;

    @FindBy(xpath="//div[@class='XDyW0e']")
    WebElement voiceSearch;

    @FindAll({
            @FindBy(partialLinkText = "العربية"),
            @FindBy(partialLinkText = "English")
    })
    WebElement langBTN;
    public Search(WebDriver driver) {
    }

    public Search() {

    }


    public Result clickOnGoogleSearchBtn() throws InterruptedException {
        googleSearchBtn.click();
        return new Result();
    }
    public void clickOnGoogleLogo(){
        googleLogo.click();
    }
    public Result clickOnEnterInSearchTextBox(){
        searchTextBox.sendKeys(Keys.ENTER);
        return new Result();
    }
    public void enterSearchKey(String key)
    {
        searchTextBox.sendKeys(key);
    }
    public String getSearchKey()
    {
        return searchTextBox.getText();
    }

    public WebElement getGoogleSearchBtn()
    {
        return googleSearchBtn;
    }

    public WebElement getGoogleLogo() {
        return googleLogo;
    }
    public WebElement getLangBTN(){return langBTN;}
    public void clickOnLangBTN(){langBTN.click();}
}
