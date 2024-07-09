package stepDefinitions;

import java.io.File; 
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerifyNewDeals {
	
	WebDriver driver = new ChromeDriver();
		
@Given("user is on deals page")
	public void user_is_on_deals_page() throws IOException, InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        driver.get("https://gourmetgarden.in/");
        
        driver.manage().window().maximize();
        
        String actualUrl=driver.getCurrentUrl();
        String expextedurl="https://gourmetgarden.in/";
        Assert.assertEquals(actualUrl, expextedurl);
        System.out.println("succesful");
        driver.findElement(By.xpath("//*[@id=\"modalLocation\"]/div/button[1]")).click();
        
        Alert alert = driver.switchTo().alert(); // switch to alert
        String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();
        
        driver.findElement(By.xpath("//a[@data-store-href='https://gourmetgarden.in']")).click();
        driver.findElement(By.xpath ( "//img[@src='//cdn.shopify.com/s/files/1/0275/8020/3094/files/new_deals_small3-compress-min.jpg?v=1637668419']")).click();
        driver.manage().window().maximize();
       
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.png");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot successful");
        
        
        
        
        
	}
   
	@When("user clicks on  particular product")
	public void user_clicks_on_particular_product() throws IOException {
		driver.findElement(By.xpath("//img[@src='//cdn.shopify.com/s/files/1/0275/8020/3094/products/Bangalorebluegrapes_9a4f5dc4-c11f-4bb7-802a-834bd86652c6_300x.jpg?v=1641748820']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.1.png");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot successful");
	}
   
	@Then("user should able to see the offers on particular product")
	public void user_should_able_to_see_the_offers_on_particular_product() {
		 System.out.println("user can see the offers on product");
		    driver.close();
	}
  
	@When("user clicks on Italian Basil")
	public void user_clicks_on_italian_basil() throws IOException {
	    driver.findElement(By.xpath("//img[@src='//cdn.shopify.com/s/files/1/0275/8020/3094/products/basilitalian_e1d152a3-3538-4aeb-8687-f562014f352d_300x.jpg?v=1652424839']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
        
        
	    
	    File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.2.png");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot successful");
	}
   
	@Then("user should able to see the offers on Italian Basil")
	public void user_should_able_to_see_the_offers_on_italian_basil() {
		System.out.println("user can see the offers on Italian Basil");
	    driver.close();
	    
	}
   
	@When("user clicks on Yellow Zucchini - Sliced")
	public void user_clicks_on_yellow_zucchini_sliced() throws IOException {
	    driver.findElement(By.xpath("//img[@src='//cdn.shopify.com/s/files/1/0275/8020/3094/products/ZucchiniSliced_caadb9f3-86ee-4c14-8fd3-bef1d1b3704e_300x.jpg?v=1671720284']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.3.png");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot successful");
	}
   
	@Then("user should able to see the offers on Yellow Zucchini - Sliced")
	public void user_should_able_to_see_the_offers_on_yellow_zucchini_sliced() {
		System.out.println("user can see the offers on Yellow Zucchini - Sliced");
	    driver.close();
	}
   
	@When("user clicks on A2 Gir Cow Ghee")
	public void user_clicks_on_a2_gir_cow_ghee() throws IOException {
		Actions act=new Actions(driver);
	    WebElement ghee=driver.findElement(By.xpath("//img[@src='//cdn.shopify.com/s/files/1/0275/8020/3094/products/GheeBottle1_300x.jpg?v=1666075112']"));
	    act.moveToElement(ghee).click().build().perform();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.4.png");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot successful");
	}
  
	@Then("user should able to see the offers on A2 Gir Cow Ghee")
	public void user_should_able_to_see_the_offers_on_a2_gir_cow_ghee() {
		System.out.println("user can see the offers on A2 Gir Cow Ghee");
	    driver.close();
	}


}
