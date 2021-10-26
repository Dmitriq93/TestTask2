package pages.realth_home;

import org.openqa.selenium.*;
import org.testng.Assert;
import pages.base.BasePage;
import static pages.realth_home.AddEntryPage.a;

public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public BlogPage verificationNewBlog() {
        WebElement blog = driver.findElement(By.xpath("//a[text()='" + a + "']"));
        blog.click();
        WebElement name = driver.findElement(By.xpath("//a[text()='" + a + "']"));
        String tit = name.getText();
        Assert.assertEquals(tit, String.valueOf(a));
        return this;
    }
}
