package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

//1- https://www.youtube.com/ adresine gidiniz
//2- "Selenium" kelimesi ile video aratınız.
//3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//4- Son videonun title ını yazdırınız.
public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("[autocapitalize='none']"));
        searchBox.sendKeys("Selenium");

        WebElement searchbtn = driver.findElement(By.cssSelector("[id='search-icon-legacy']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='search-icon-legacy']")));
        searchbtn.click();

        driver.manage().deleteAllCookies();
        Bekle(3);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", 1);
        //scrollDown.executeScript("window.scrollTo(0, document.body.scrollHeight");

//        List<WebElement> videoELements=driver.findElements(By.cssSelector("[id='img'][width='360'][src^='https']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView()", videoELements.get(6));



    }
}
