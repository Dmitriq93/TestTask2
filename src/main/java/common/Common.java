package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static constants.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class Common {

    public static WebDriver createDriver() {
        try {
            File file = new File("webdriver.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            WebDriver driver = null;

            switch (properties.getProperty(Config.KEY_PROPERTIES_WEBDRIVER_USE)) {
                case Config.VALUE_PROPERTIES_WEBDRIVER_FIREFOX:
                    if (!properties.containsKey(Config.KEY_PROPERTIES_WEBDRIVER_PATH_FIREFOX)) {
                        throw new Exception("text1");
                    }
                    System.setProperty(Config.KEY_PROPERTIES_WEBDRIVER_PATH_FIREFOX, properties.getProperty(Config.KEY_PROPERTIES_WEBDRIVER_PATH_FIREFOX));
                    driver = new FirefoxDriver();
                    break;
                case Config.VALUE_PROPERTIES_WEBDRIVER_CHROME:
                    if (!properties.containsKey(Config.KEY_PROPERTIES_WEBDRIVER_PATH_CHROME)) {
                        throw new Exception("text2");
                    }
                    System.setProperty(Config.KEY_PROPERTIES_WEBDRIVER_PATH_CHROME, properties.getProperty(Config.KEY_PROPERTIES_WEBDRIVER_PATH_CHROME));
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new Exception("text3");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            return driver;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка",e);
        }
    }
}
