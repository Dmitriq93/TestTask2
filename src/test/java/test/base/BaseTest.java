package test.base;

import common.Common;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.realth_home.*;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = Common.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SeleniumLoginPage seleniumLoginPage = new SeleniumLoginPage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected AddEntryPage addEntryPage = new AddEntryPage(driver);
    protected BlogPage blogPage = new BlogPage(driver);
    protected AdminPanelPage adminPanelPage = new AdminPanelPage(driver);

    @AfterSuite(alwaysRun = true)
     public void close(){
         if (HOLD_BROWSER_OPEN){
             driver.quit();
         }
     }





}
