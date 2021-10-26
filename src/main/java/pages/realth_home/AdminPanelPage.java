package pages.realth_home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import static pages.realth_home.AddEntryPage.a;

public class AdminPanelPage extends BasePage {

    private final By Xnameblob = By.xpath("//a[text()='" + a + "']");
    private final By Xdelete = By.xpath("//a[text()='Удалить']");
    private final By Xconfirmation = By.xpath("//input[@value='Да, я уверен']");

    public AdminPanelPage(WebDriver driver) {
        super(driver);
    }

    public AdminPanelPage deleteblog() {
        WebElement nameblob = driver.findElement(Xnameblob);
        nameblob.click();
        WebElement delete = driver.findElement(Xdelete);
        delete.click();
        WebElement confirmation = driver.findElement(Xconfirmation);
        confirmation.click();
        return this;
    }
}
