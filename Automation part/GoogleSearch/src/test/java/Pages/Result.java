package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Result  extends Base.base{

    @FindBy(xpath="//*[@id=\"topstuff\"]/div/div/p[1]")
    WebElement searchKeyNotfound;

    public WebElement getSearchKeyNotfound()
    {
        return searchKeyNotfound;
    }


}
