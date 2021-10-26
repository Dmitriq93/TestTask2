package test.task;

import org.testng.annotations.Test;
import test.base.BaseTest;
import static constants.Constants.Urls.*;

public class TaskTest extends BaseTest {

    @Test
    public void testTask() {
        basePage.open(REALT_LOGIN_PAGE);
        realtLoginPage.entry();
    }

    @Test
    public void verificationPanel() {
        homePage.verificationTit().clickadd();
        addEntryPage.checkTit().newBlog();
    }

    @Test
    public void verificationNewBlog(){
        basePage.open(BLOG);
        blogPage.verificationNewBlog();
        basePage.open(AdminPanelPage);
        adminPanelPage.deleteblog();
    }
}
