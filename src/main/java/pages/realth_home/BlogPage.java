package pages.realth_home;

import org.openqa.selenium.*;
import org.testng.Assert;
import pages.base.BasePage;
import static pages.realth_home.AddEntryPage.stringTitle;

public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public BlogPage checkNewBlog() {
        WebElement blog = driver.findElement(By.xpath("//a[text()='" + stringTitle + "']"));
        blog.click();
        WebElement name = driver.findElement(By.xpath("//a[text()='" + stringTitle + "']"));
        String tit = name.getText();
        Assert.assertEquals(tit, String.valueOf(stringTitle));
        return this;
    }
}
