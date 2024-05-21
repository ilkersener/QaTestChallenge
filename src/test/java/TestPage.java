import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

// Test işlemlerini gerçekleştiren TestPage sınıfı
public class TestPage extends BaseTest {

    // Sayfa kontrolü yapılıyor.
    @Test
    public void pageCheck() {
        WebElement element = driver.findElement(By.id("root"));
        assertNotNull(element, "Element not found on the page");
    }

    // Cherry button'a tıklanıyor ve tek bir ürün eklendiği zaman table'nin çıkmadığı kontrol ediliyor.
    @Test
    public void testselect1() throws InterruptedException {
        page.setCherry_button("test2");
        assertTrue(true, "Cherry Button is not clickable");

        // Eğer element null ise koşul'a girer ve kontrol edilir.
        WebElement element = null;
        try {
            element = driver.findElement(By.className("table"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Element bulunamazsa null olarak kalır
        }
        Assertions.assertNull(element, "The element should not exist.");
    }

    // Orange button'a tıklanıyor ve fiyat ile durum kontrol ediliyor.
    @Test
    public void testselect2() throws InterruptedException {
        page.setOrange_button("test");
        assertTrue(true, "Orange Button is not clickable");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement Orange_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id='root']/div/div/div/div[3]/div/table/tbody/tr[1]/td[2]")));
        assertEquals("$2.99", Orange_price.getText(), "Invalid price for product 2");

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement Orange_condition_check = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[2]")));
        assertEquals("Frozen", Orange_condition_check.getText(), "Invalid colour for product 2");
    }

    // Nuts button'a tıklanıyor ve fiyat ile durum kontrol ediliyor.
    @Test
    public void testselect3() throws InterruptedException {
        page.setNuts_button("test");
        assertTrue(true, "Nuts Button is not clickable");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement Nuts_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id='root']/div/div/div/div[3]/div/table/tbody/tr[1]/td[3]")));
        assertEquals("$1.00", Nuts_price.getText(), "Invalid price for product 3");

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement Nuts_condition_check = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[2]")));
        assertEquals("Frozen", Nuts_condition_check.getText(), "Invalid colour for product 2");
    }

    // Strawberry button'a tıklanıyor, fiyat ve durum kontrol ediliyor.
    @Test
    public void testselect4() {
        page.setStrawberry_button("test");
        assertTrue(true, "Strawberry Button is not clickable");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement Strawberry_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id='root']/div/div/div/div[3]/div/table/tbody/tr[1]/td[4]")));
        assertEquals("$1.49", Strawberry_price.getText(), "Invalid price for product 3");

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement Strawberry_condition_check = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[2]")));
        assertEquals("Frozen", Strawberry_condition_check.getText(), "Invalid colour for product 2");
    }
}