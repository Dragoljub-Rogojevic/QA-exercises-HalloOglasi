package BaseHalloOglassi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseHalloOglasi {
    protected static WebDriver driver;
    protected static WebDriverWait wdWait;
    protected static JavascriptExecutor js;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        wdWait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
        String urlHalloOglasiHomePage = "https://www.halooglasi.com/";
        driver.get(urlHalloOglasiHomePage);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        //driver.quit();
    }
}
