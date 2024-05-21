import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    private WebDriver driver;
    protected By Cherry_button = By.className("view_details");
    private final By Orange_button = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[2]");
    private final By Nuts_button = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[2]/div[3]/div/div[2]");
    private final By Strawberry_button = new By.ByXPath
            ("//*[@id=\"root\"]/div/div/div/div[2]/div[4]/div/div[2]");

    public Page(WebDriver driver){
        this.driver = driver;
    }



    public void setCherry_button(String name) throws InterruptedException {

        WebElement buttonSelect1 = driver.findElement(Cherry_button);
        buttonSelect1.click();
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[2]"));
        Thread.sleep(2000);

    }
    public void setOrange_button(String name) throws InterruptedException {

        WebElement buttonSelect2 = driver.findElement(Orange_button);
        buttonSelect2.click();
        Thread.sleep(2000);

    }
    public void setNuts_button(String name) throws InterruptedException {

        WebElement buttonSelect2 = driver.findElement(Nuts_button);
        buttonSelect2.click();
        Thread.sleep(2000);


    }
    public void setStrawberry_button(String name){

        WebElement buttonSelect2 = driver.findElement(Strawberry_button);
        buttonSelect2.click();

    }
}
