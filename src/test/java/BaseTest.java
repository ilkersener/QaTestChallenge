import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    Page page = new Page(null); // Page sınıfından nesne oluşturuluyor.

    protected WebDriver driver; // WebDriver nesnesi tanımlanıyor.

    @BeforeAll
    public void setUp() throws InterruptedException {
        // WebDriver'ın ayarları yapılıyor.
        System.setProperty("webdriver.chrome,driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Testin başlangıcında belirtilen URL'e gidiliyor.
        driver.get("https://react-compare-app.surge.sh/");
        // Page nesnesi oluşturuluyor.
        page = new Page(driver);
        Thread.sleep(5000);

        // Beklenen URL ve gerçek URL karşılaştırılıyor.
        String expectedURL = "https://react-compare-app.surge.sh/";
        String actualURL = driver.getCurrentUrl();

    }
    @AfterAll
    public void tearDown(){
        // WebDriver kapatılıyor.
        if (driver!=null){
       driver.quit();
    }
    }
}
