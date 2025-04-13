package tests;

import org.h2.Driver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;

import java.net.URL;

public class SampleTest extends BaseTest {

    private AndroidDriver<MobileElement> driver;
    
    @Test
    public void testCreateWalletFlow() throws InterruptedException {
        

        // Step 1: Tap on "Create new wallet"
        MobileElement addWalletBtn = Driver
                .findElementByXPath("//android.widget.TextView[@text='Add wallet']");
        createWalletBtn.click();
        Thread.sleep(1000);

        // Step 2: Check the checkbox to accept Terms
        MobileElement createWalletBtn = Driver
                .findElementByXPath("//android.widget.TextView[@text='Create new wallet']");
        createWalletBtn.click();
        Thread.sleep(3000);

        // Step 3: Confirm backup phrase screen is visible
        MobileElement backupTitle = driver.findElementByXPath("//*[contains(@text, 'Main Wallet')]");
        assert backupTitle.isDisplayed();
    }


}