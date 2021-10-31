package test.task;

import org.testng.annotations.Test;
import test.base.BaseTest;
import static constants.Constants.Urls.*;

public class TaskTest extends BaseTest {

    @Test
    public void testTask() {
        basePage.open(SELENIUM_LOGIN_PAGE);
        seleniumLoginPage.entry();
    }

    @Test
    public void verificationPanel() {
        homePage.verificationTit().clickAdd();
        addEntryPage.checkTit().newBlog();
    }

    @Test
    public void verificationnewblog() {
        basePage.open(BLOG);
        blogPage.checkNewBlog();
        basePage.open(AdminPanelPage);
        adminPanelPage.deleteBlog();
    }
}
