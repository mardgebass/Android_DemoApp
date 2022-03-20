package ru.gb;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NotSamePasswordTest {

    @Test
    public void checkConfirmPassword() throws MalformedURLException, InterruptedException {

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

//      Выбираем Sign up на экране логин/пароль.
            MobileElement signUp = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
            signUp.click();
            Thread.sleep(2000);

//      Вводим Email на экране логин/пароль.
            MobileElement email = (MobileElement) driver.findElementByAccessibilityId("input-email");
            email.sendKeys("test123@mail.ru");
            Thread.sleep(2000);

//      Вводим Password на экране логин/пароль.
            MobileElement password = (MobileElement) driver.findElementByAccessibilityId("input-password");
            password.sendKeys("testtest123");
            Thread.sleep(2000);

//      Подтверждаем Password на экране логин/пароль.
            MobileElement passwordConfirm = (MobileElement) driver.findElementByAccessibilityId("input-repeat-password");
            passwordConfirm.sendKeys("testtest");
            Thread.sleep(2000);

//      Нажимаем Login на экране логин/пароль.
            MobileElement signUpButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView");
            signUpButton.click();
            Thread.sleep(2000);

//      Проверяем текст ошибки.
            MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[3]");
            Assert.assertEquals(errorText.getText(), "Please enter the same password");
        }

    }
