import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    Page page = new Page(null);
    protected WebDriver driver;

    @BeforeAll
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome,driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://react-compare-app.surge.sh/");
        page = new Page(driver);
        Thread.sleep(5000);



    }
    //@AfterAll
    //public void systemdown(){
       // driver.quit();
    }
