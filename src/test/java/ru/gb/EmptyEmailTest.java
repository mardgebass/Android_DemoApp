package ru.gb;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class EmptyEmailTest {

    @Test
    public void checkEmptyEmail() throws MalformedURLException, InterruptedException {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Pixel");
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("app", "D:/GB_study/apk/Android-NativeDemoApp-0.2.1.apk");

//      Устанавливаем и открываем приложение
            MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Thread.sleep(2000);

//      Нажимаем Login в меню
            MobileElement loginMenuButton = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView[2]");
            loginMenuButton.click();
            Thread.sleep(2000);

//      Нажимаем Login на экране логин/пароль.
            MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup/android.widget.TextView");
            loginButton.click();
            Thread.sleep(2000);

//      Проверяем текст ошибки.
            MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
            Assert.assertEquals(errorText.getText(), "Please enter a valid email address");
        }

    }
