package deik.pti.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebDriverFactory {
    public static WebDriver webDriver;

    @Value("${headless:true}")
    private Boolean headless;

    public WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = setupChromeDriver();
        }
        return webDriver;
    }

    private WebDriver setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
        var options = new ChromeOptions()
                .addArguments("--remote-allow-origins")
                .addArguments("--start-maximized");
        options = headless ? options.addArguments("--headless=new") : options;
        return new ChromeDriver(options);
    }

    public void closeWebDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver.quit();
            webDriver = null;
        }
    }
}
