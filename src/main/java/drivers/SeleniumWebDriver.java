package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.*;

public abstract class SeleniumWebDriver implements WebDriverProvider {
  public static WebDriver createDriver() {
    AppiumDriver driver = null;
    UiAutomator2Options options = new UiAutomator2Options();
    options.setDeviceName("Nexus_S_API_22");
    options.setPlatformName("Android");
    options.setPlatformVersion("5.1.1");
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setCapability(APPLICATION_NAME, "Appium");
    options.setApp("C:/appiumtest/app_debug.apk");
    try {
      return new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), options);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    return driver;
  }
}

