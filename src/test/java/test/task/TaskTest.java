package test.task;
import org.testng.annotations.Test;
import test.base.BaseTest;
import static constants.Constants.Urls.*;

public class TaskTest extends BaseTest {

    @Test
    public void testtask() {
        basePage.open(REALT_LOGIN_PAGE);
        realtLoginPage.entry();
    }

    @Test
    public void verificationPanel() {
        homePage.verificationTit().clickadd();
        addEntryPage.checktit().newblog();
    }

    @Test
    public void verificationnewblog(){
        basePage.open(BLOG);
        blogPage.verificationnewblog();
        basePage.open(AdminPanelPage);
        adminPanelPage.deleteblog();
    }
}
