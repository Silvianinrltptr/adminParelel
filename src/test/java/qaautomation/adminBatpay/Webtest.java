package qaautomation.adminBatpay;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Webtest {
    private static final Logger logger = Logger.getLogger(Webtest.class.getName());


//    @Test
//    public void testKYC() {
////     System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
//     WebDriver driver;
//     WebDriverManager.firefoxdriver().setup();
//     driver = new FirefoxDriver();
//     
//     driver.get("https://sb-batpanel.batpay.id/");
//     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("operation@batpay.id");
//	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P@ssw0rd");
//	 driver.findElement(By.xpath("//button[normalize-space()='Masuk']")).click();
//	 driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
//	 driver.findElement(By.xpath("(//span[normalize-space()='Request Upgrade Pelanggan (KYC)'])[1]")).click();
//	 String actualText = driver.findElement(By.xpath("(//span[contains(text(),'Request Upgrade Pelanggan (KYC)')])[2]")).getText();
//		String expectedText = "Request Upgrade Pelanggan (KYC)";
//		Assert.assertTrue(actualText.contains(expectedText));
//	driver.findElement(By.xpath("(//a[normalize-space()='Lihat'])[1]")).click();
//	driver.findElement(By.xpath("(//div[contains(text(),'Silakan isi Komentar')])[1]")).sendKeys("ok");
//	driver.findElement(By.xpath("(//button[normalize-space()='Setuju'])[1]")).click();
//	
//	driver.quit();
//    }
    
    
//    @Test
//    public void testBlokir() {
//        // Set up the first WebDriver
//        WebDriver driver1;
//        WebDriverManager.firefoxdriver().setup();
//        driver1 = new FirefoxDriver();
//
//        // Run the test for the first WebDriver
//        runTest(driver1);
//
//        // Close the first browser
//        driver1.quit();
//
//        // Set up the second WebDriver
//        WebDriver driver2;
//        WebDriverManager.firefoxdriver().setup();
//        driver2 = new FirefoxDriver();
//
//        // Run the test for the second WebDriver
//        runTest(driver2);
//
//        // Close the second browser
//        driver2.quit();
//    }
//
//    private void runTest(WebDriver driver) {
//        driver.get("https://sb-batpanel.batpay.id/");
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("operation@batpay.id");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P@ssw0rd");
//        driver.findElement(By.xpath("//button[normalize-space()='Masuk']")).click();
//        driver.findElement(By.xpath("//body/div/div/nav/ul/li[6]/a[1]")).click();
//        driver.findElement(By.xpath("(//span[contains(text(),'Permintaan')])[1]")).click();
//        String actualText = driver.findElement(By.xpath("(//span[normalize-space()='Buka Blokir Akun'])[1]")).getText();
//        String expectedText = "Buka Blokir Akun";
//        Assert.assertTrue(actualText.contains(expectedText));
//        driver.findElement(By.xpath("(//a[normalize-space()='Telepon'])[1]")).click();
//        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("0895379072232");
//        driver.findElement(By.xpath("(//span[contains(text(),'Permintaan')])[1]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement lihatElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Lihat'])[1]")));
//        lihatElement.click();
//        driver.findElement(By.xpath("(//div[@role='textbox'])[1]")).sendKeys("oke");
//        driver.findElement(By.xpath("(//button[normalize-space()='Setuju'])[1]")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Setuju')]")).click();
//   
//        
//    }
//    
//     
//}

   
//	@Test
//    public void testBlokir() {
//        // Buat dan mulai thread untuk setiap tes
//        Thread thread1 = new Thread(() -> runTest("operation@batpay.id", "P@ssw0rd"));
//        Thread thread2 = new Thread(() -> runTest("o@batpay.id", "P@ssw0rd"));
//
//        // Start kedua thread
//        thread1.start();
//        thread2.start();
//
//        try {
//            // Tunggu kedua thread selesai
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void runTest(String username, String password) {
//        WebDriver driver = null;
//        try {
//            // Persiapkan WebDriver
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//
//            // Navigasi ke situs web
//            driver.get("https://sb-batpanel.batpay.id/");
//
//            // Isi formulir login
//            driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
//            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//            driver.findElement(By.xpath("//button[normalize-space()='Masuk']")).click();
//            driver.findElement(By.xpath("//body/div/div/nav/ul/li[6]/a[1]")).click();
//			
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			
//			// Tunggu hingga elemen "Permintaan" muncul
//			WebElement permintaanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Permintaan')])[1]")));
//			
//			// Klik elemen "Permintaan"
//			permintaanElement.click();
//			//WebDriverWait wait = new WebDriverWait(driver, 10);
//          String actualText = driver.findElement(By.xpath("(//span[normalize-space()='Buka Blokir Akun'])[1]")).getText();
//          String expectedText = "Buka Blokir Akun";
//          Assert.assertTrue(actualText.contains(expectedText));
//          driver.findElement(By.xpath("(//a[normalize-space()='Telepon'])[1]")).click();
//          driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("0887097178");
//          
////          WebDriverWait wait = new WebDriverWait(driver, 20);
//          driver.findElement(By.xpath("(//a[normalize-space()='Lihat'])[1]")).click();
//          driver.findElement(By.xpath("//div[@role='textbox']")).click();
////          WebDriverWait wait = new WebDriverWait(driver, 10);
////          WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Permintaan')])[1]")));
////          element.click();
//          driver.findElement(By.xpath("(//div[@role='textbox'])[1]")).sendKeys("oke");
//          driver.findElement(By.xpath("(//button[normalize-space()='Setuju'])[1]")).click();
//          driver.findElement(By.xpath("//button[contains(text(),'Setuju')]")).click();
//
//        } finally {
//            // Tutup browser setelah selesai
//            if (driver != null) {
//                driver.quit();
//            }
//        }
//    }
	
	@Test
	public void testBlokir() {
	    // Buat dan mulai thread untuk setiap tes
	    Thread thread1 = new Thread(() -> runTest("operation@batpay.id", "P@ssw0rd"));
	    Thread thread2 = new Thread(() -> runTest("o@batpay.id", "P@ssw0rd"));
        logger.info("x adalah pesan info.");

	    // Start kedua thread
	    thread1.start();                    
//	    thread2.start();

	    try {
	        // Tunggu kedua thread selesai
	        thread1.join();
//	        thread2.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	
	private void runTest(String username, String password) {
	    WebDriver driver = null;
	    try {
	        // Persiapkan WebDriver
	        WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
	
	        // Navigasi ke situs web
	        driver.get("https://sb-batpanel.batpay.id/");
	
	        // Isi formulir login
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	
	        // Tunggu hingga elemen "Username" muncul
	        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
	        usernameElement.sendKeys(username);
	
	        // Tunggu hingga elemen "Password" muncul
	        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
	        passwordElement.sendKeys(password);
	
	        // Tunggu hingga elemen "Masuk" muncul
	        WebElement masukButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Masuk']")));
	        masukButton.click();
	
	        // Tunggu hingga elemen di menu muncul
	        WebElement menuElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div/div/nav/ul/li[6]/a[1]")));
	        menuElement.click();
	
	
			 // Tunggu hingga elemen "Permintaan" muncul
			 WebElement permintaanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Permintaan')])[1]")));
			
			 // Klik elemen "Permintaan"
			 permintaanElement.click();
			
			 // Tunggu hingga elemen "Buka Blokir Akun" muncul
			 WebElement bukaBlokirElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='Buka Blokir Akun'])[1]")));
			 String actualText = bukaBlokirElement.getText();
			 String expectedText = "Buka Blokir Akun";
			 Assert.assertTrue(actualText.contains(expectedText));
			 
			// Tunggu hingga elemen "Telepon" muncul
            WebElement teleponElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Telepon'])[1]")));
            teleponElement.click();

            // Tunggu hingga elemen input telepon muncul
            WebElement teleponInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]")));
            teleponInput.sendKeys("0887097178");

            // Tunggu hingga elemen "Lihat" pertama muncul dan coba klik hingga 3 kali
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement lihatElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Lihat')])[1]")));
                    lihatElement.click();
                    break; // Keluar dari loop jika berhasil diklik
                } catch (Exception e) {
                    // Tangkap eksepsi dan log pesan kesalahan
                    logger.warning("Gagal mengklik elemen 'Lihat' pertama. Percobaan ke-" + (i + 1));
                }
            }


            logger.info("Ini adalah pesan info.");


            // Tunggu hingga elemen "role='textbox'" muncul
            WebElement textBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='textbox']")));
            textBoxElement.click();
            logger.info("Ini adalah pesan infox.");

            // Tunggu hingga elemen "Setuju" muncul
            WebElement setujuElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Setuju'])[1]")));
            setujuElement.click();
	
	    } finally {
	        // Tutup browser setelah selesai
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

}