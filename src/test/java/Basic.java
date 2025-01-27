import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class Basic {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://34.220.253.127/emedia/cbp");
		driver.findElement(By.xpath("//input[@id='signin-email']")).sendKeys("Dataglance");
		driver.findElement(By.xpath("//input[@id='signin-password']")).sendKeys("super");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@ class='hvr-grow'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[@class='active ng-tns-c229-0'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[1]")).sendKeys("Section");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@data-group='basic'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[2]")).sendKeys("Sub Section");

		//driver.findElement(By.xpath("(//span[@data-group='basic'])[2]")).sendKeys("Section");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[3]")).sendKeys("Step Action");

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@data-group='basic'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[4]")).sendKeys("Signature Step");
		Thread.sleep(8000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"pointer fontSize-Index responsiveFont ng-tns-c229-0\"])[2]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id=\"1_anchor\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class=\"active ng-tns-c229-0\"])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[5]")).sendKeys("Step Action");
		Thread.sleep(2000);
		// driver.findElement(
		// By.xpath("//div[@class='textareacont sticky removemb ng-tns-c231-3 dscenter
		// ng-star-inserted']"))
		// .click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//span[@data-group='basic'])[5]")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class=\"p-1 flex-fill ng-tns-c231-5 wid-90\"]")).click();

		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/textarea[@name=\"header\"])[6]")).sendKeys("Step info");
		Thread.sleep(2000);
	

		driver.findElement(By.xpath("(//a[@class=\"pointer fontSize-Index responsiveFont ng-tns-c229-0\"])[2]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id=\"1_anchor\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class=\"active ng-tns-c229-0\"])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div/textarea[@type=\"text\"])[7]")).sendKeys("step Action");
	//	(//div/textarea[@name="header"])[7]
		driver.findElement(By.xpath("(//span[@data-group='basic'])[7]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[@class=\"pointer fontSize-Index responsiveFont ng-tns-c229-0\"])[2]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id=\"1_anchor\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class=\"active ng-tns-c229-0\"])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[8]")).click();
		driver.findElement(By.xpath("(//div/textarea[@type=\"text\"])[8]")).sendKeys("Delay step");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@data-group='basic'])[9]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@data-group='basic'])[3]")).click();

	}
}
