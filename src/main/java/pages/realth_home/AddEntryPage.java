package pages.realth_home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class AddEntryPage extends BasePage {

    private final By XTitle = By.xpath("//input[@id='id_title']");
    private final By XSlug = By.xpath("//input[@id='id_slug']");
    private final By XxPanel = By.xpath("(//h1)[2]");
    private final By XTextMarkdown = By.xpath("//textarea [@name='text_markdown']");
    private final By XText = By.xpath("//textarea[@name='text']");
    private final By XSave = By.xpath("//input[@value='Сохранить']");
    public static int a = 100000000 + (int) (Math.random() * 999999999);

    public AddEntryPage(WebDriver driver) {
        super(driver);
    }

    public AddEntryPage checkTit() {
        WebElement panel = driver.findElement(XxPanel);
        String tiit = panel.getText();
        Assert.assertEquals(tiit, "Добавить entry");
        return this;
    }

    public AddEntryPage newBlog() {
        WebElement title = driver.findElement(XTitle);
        title.sendKeys(String.valueOf(a));

        WebElement slug = driver.findElement(XSlug);
        int b = 100000000 + (int) (Math.random() * 999999999);
        slug.clear();
        slug.sendKeys(String.valueOf(b));

        WebElement textMarkdown = driver.findElement(XTextMarkdown);
        int c = 100000000 + (int) (Math.random() * 999999999);
        textMarkdown.sendKeys(String.valueOf(c));

        WebElement text = driver.findElement(XText);
        int d = 100000000 + (int) (Math.random() * 999999999);
        text.sendKeys(String.valueOf(d));

        WebElement save = driver.findElement(XSave);
        save.click();
        return this;
    }
}
