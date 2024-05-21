import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Web elementleri ve işlemleri tanımlayan Page sınıfı
public class Page {

    private WebDriver driver; // WebDriver nesnesi tanımlanıyor.
    protected By Cherry_button = By.className("view_details"); // Cherry button'a ulaşmak için locator tanımlanıyor.
    public By Orange_button = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[2]"); // Orange button'a ulaşmak için locator tanımlanıyor.
    public By Nuts_button = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[2]/div[3]/div/div[2]"); // Nuts button'a ulaşmak için locator tanımlanıyor.
    public By Strawberry_button = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[2]/div[4]/div/div[2]"); // Strawberry button'a ulaşmak için locator tanımlanıyor.

    // Fiyat elementlerine ulaşmak için locator'lar tanımlanıyor.
    public By Cherry_price = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[1]/td[1]");
    public By Orange_price = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[1]/td[2]");
    public By Nuts_price = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[1]/td[3]");
    public By Strawberry_price = new By.ByXPath
            ("////*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[1]/td[4]");

    // Durum elementlerine ulaşmak için locator'lar tanımlanıyor.
    public By Cherry_condition_check = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[1]");

    public By Orange_condition_check = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[2]");

    public By Nuts_condition_check = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[3]");

    public By Strawberry_condition_check = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[3]/div/table/tbody/tr[3]/td[4]");

    public Page(WebDriver driver){
        this.driver = driver; // Constructor'da WebDriver nesnesi alınıyor.
    }

    // Cherry button tıklanıyor ve bekleniyor.
    public void setCherry_button(String name) throws InterruptedException {

        WebElement cherry_selection = driver.findElement(Cherry_button);
        cherry_selection.click();
        WebElement button = driver.findElement(By.xpath
                ("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[2]"));
        Thread.sleep(2000);

    }

    // Orange button tıklanıyor ve bekleniyor.
    public void setOrange_button(String name) throws InterruptedException {

        WebElement orange_selection = driver.findElement(Orange_button);
        orange_selection.click();
        Thread.sleep(2000);

    }

    // Nuts button tıklanıyor ve bekleniyor.
    public void setNuts_button(String name) throws InterruptedException {

        WebElement nuts_selection = driver.findElement(Nuts_button);
        nuts_selection.click();
        Thread.sleep(2000);


    }

    // Strawberry button tıklanıyor.
    public void setStrawberry_button(String name){

        WebElement strawberry_selection = driver.findElement(Strawberry_button);
        strawberry_selection.click();

    }
}