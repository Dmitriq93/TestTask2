package pages.realth_home;
import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import java.time.Duration;
import static pages.realth_home.AddEntryPage.a;
public class BlogPage extends BasePage {
    public BlogPage(WebDriver driver) {
        super(driver);
    }


    public BlogPage verificationnewblog() {
        WebElement blog = driver.findElement(By.xpath("//a[text()='" + a + "']"));
        blog.click();
        WebElement name = driver.findElement(By.xpath("//a[text()='" + a + "']"));
        String tit = name.getText();
        Assert.assertEquals(tit, String.valueOf(a));
        return this;
    }
}
