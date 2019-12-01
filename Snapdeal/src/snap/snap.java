package snap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snap {

		public static void main(String[] args) throws InterruptedException
		{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\513357\\Desktop\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("Ray Ban");
		WebElement searchButton =driver.findElement(By.xpath("//Button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchButton.click();
		Thread.sleep(3000);
		WebElement prod1 = driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[@supc='SDL345653483']"));
		//Javas
		Actions ac=new Actions(driver);
		ac.moveToElement(prod1).perform();
		prod1.click();
		prod1.getAttribute("value");
		//WebElement prod2 = driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[@supc='SDL838854953']"));
		//WebElement prod3 = driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[@supc='SDL531124225']"));
		//WebElement prod4 = driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[@supc='SDL702386596']"));
		}

		

	}


