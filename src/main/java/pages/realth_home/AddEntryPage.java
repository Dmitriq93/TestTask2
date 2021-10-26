package pages.realth_home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class AddEntryPage extends BasePage {
    public AddEntryPage(WebDriver driver) {
        super(driver);
    }

    private final By Xtitle = By.xpath("//input[@id='id_title']");
    private final By XSlug = By.xpath("//input[@id='id_slug']");
    private final By XxPanel = By.xpath("(//h1)[2]");
    private final By Xtextmarkdown = By.xpath("//textarea [@name='text_markdown']");
    private final By Xtext = By.xpath("//textarea[@name='text']");
    private final By Xsave = By.xpath("//input[@value='Сохранить']");
    public static int a = 100000000 + (int) (Math.random() * 999999999);


    public AddEntryPage checktit() {
        WebElement panel = driver.findElement(XxPanel);
        String tiit = panel.getText();
        Assert.assertEquals(tiit, "Добавить entry");
        return this;
    }

    public AddEntryPage newblog() {
        WebElement title = driver.findElement(Xtitle);
        title.sendKeys(String.valueOf(a));

        WebElement slug = driver.findElement(XSlug);
        int b = 100000000 + (int) (Math.random() * 999999999);
        slug.clear();
        slug.sendKeys(String.valueOf(b));

        WebElement textmarkdown = driver.findElement(Xtextmarkdown);
        int c = 100000000 + (int) (Math.random() * 999999999);
        textmarkdown.sendKeys(String.valueOf(c));

        WebElement text = driver.findElement(Xtext);
        int d = 100000000 + (int) (Math.random() * 999999999);
        text.sendKeys(String.valueOf(d));

        WebElement save = driver.findElement(Xsave);
        save.click();
        return this;
    }
}
