package pages.realth_home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class AddEntryPage extends BasePage {

    private final By xTitle = By.xpath("//input[@id='id_title']");
    private final By xSlug = By.xpath("//input[@id='id_slug']");
    private final By xxPanel = By.xpath("(//h1)[2]");
    private final By xTextMarkdown = By.xpath("//textarea [@name='text_markdown']");
    private final By xText = By.xpath("//textarea[@name='text']");
    private final By xSave = By.xpath("//input[@value='Сохранить']");
    public static int stringTitle = 100000000 + (int) (Math.random() * 999999999);

    public AddEntryPage(WebDriver driver) {
        super(driver);
    }

    public AddEntryPage checkTit() {
        WebElement panel = driver.findElement(xxPanel);
        String tiit = panel.getText();
        Assert.assertEquals(tiit, "Добавить entry");
        return this;
    }

    public AddEntryPage newBlog() {
        WebElement title = driver.findElement(xTitle);
        title.sendKeys(String.valueOf(stringTitle));

        WebElement slug = driver.findElement(xSlug);
        int stringSlug = 100000000 + (int) (Math.random() * 999999999);
        slug.clear();
        slug.sendKeys(String.valueOf(stringSlug));

        WebElement textMarkdown = driver.findElement(xTextMarkdown);
        int stringTextMarkdown = 100000000 + (int) (Math.random() * 999999999);
        textMarkdown.sendKeys(String.valueOf(stringTextMarkdown));

        WebElement text = driver.findElement(xText);
        int stringText = 100000000 + (int) (Math.random() * 999999999);
        text.sendKeys(String.valueOf(stringText));

        WebElement save = driver.findElement(xSave);
        save.click();
        return this;
    }
}
