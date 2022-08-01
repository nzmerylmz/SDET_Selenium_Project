package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumProject3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://shopdemo.e-junkie.com/");
        WebElement addToCart=driver.findElement(By.xpath("//button[@class=\"view_product\"][@onclick=\"return EJProductClick('1595015')\"]"));
        addToCart.click();

        WebElement validation=driver.findElement(By.xpath("//*[@class='Product-Quantity-Value readOnly']"));
        Assert.assertEquals("1", validation.getText());

        WebElement removeBtn=driver.findElement(By.cssSelector("[class='Product-Remove']"));
        removeBtn.click();

        WebElement countinueShp=driver.findElement(By.cssSelector("[class='Continue-Button Close-Cart']"));
        countinueShp.click();

        WebElement text=driver.findElement(By.xpath("//*[text()='Your Cart is empty']"));
        Assert.assertEquals("Your Cart is empty", text.getText());


    }
}
