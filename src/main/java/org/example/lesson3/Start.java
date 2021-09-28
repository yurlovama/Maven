package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import javax.swing.text.html.parser.Element;

public class Start {
        public static void main (String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");


            WebDriverManager.chromedriver().setup();
            WebDriver driver1 = new ChromeDriver();
            driver1.get("https://crm.geekbrains.space/");
            Thread.sleep(2000);

            WebElement  login = driver1.findElement(By.id("prependedInput"));
            WebElement password = driver1.findElement(By.id("prependedInput2"));
            WebElement submit = driver1.findElement(By.id("_submit"));

            login.click();
            login.sendKeys("Applanatest1");
            Thread.sleep(500);
            password.click();
            password.sendKeys("Student2020!");
            Thread.sleep(500);
            submit.click();
            Thread.sleep(5000);

            Actions action = new Actions(driver1);
            WebElement menu = driver1.findElement(By.xpath("//a//span[.='Проекты']"));
            action.moveToElement(menu).perform();
            Thread.sleep(300);
            WebElement subMenu = driver1.findElement(By.xpath("//span[text()='Все проекты']"));
            subMenu.click();
            Thread.sleep(5000);
            WebElement createProject = driver1.findElement(By.xpath("//a[.='Создать проект']"));
            createProject.click();
            Thread.sleep(5000);

            WebElement nameProject = driver1.findElement(By.xpath("//input[contains(@id, 'crm_project_name')]"));
            nameProject.click();
            nameProject.sendKeys("Test1111");
            Thread.sleep(10000);
            WebElement organization = driver1.findElement(By.xpath("//span[text()='Укажите организацию']"));
            organization.click();
            Thread.sleep(5000);
            WebElement nameorganization = driver1.findElement(By.xpath("//div[text()='«Все организации»']"));
            nameorganization.click();
            Thread.sleep(1000);

            WebElement subdivisionName = driver1.findElement(By.name("crm_project[businessUnit]"));
            subdivisionName.click();
            Thread.sleep(1000);
            WebElement subdivision = driver1.findElement(By.xpath("//*[@name=\"crm_project[businessUnit]\"]/option[2]"));
            subdivision.click();
            Thread.sleep(1000);
            WebElement curator = driver1.findElement(By.name("crm_project[curator]"));
            curator.click();
            Thread.sleep(1000);
            WebElement curatorname = driver1.findElement(By.xpath("//*[@name=\"crm_project[curator]\"]/option[20]"));
            curatorname.click();
            Thread.sleep(1000);
            WebElement ProjectManager = driver1.findElement(By.name("crm_project[rp]"));
            ProjectManager.click();
            Thread.sleep(1000);
            WebElement ProjectManagerName = driver1.findElement(By.xpath("//*[@name=\"crm_project[rp]\"]/option[20]"));
            ProjectManagerName.click();
            Thread.sleep(1000);
            WebElement Manager = driver1.findElement(By.name("crm_project[manager]"));
            Manager.click();
            Thread.sleep(1000);
            WebElement ManagerName = driver1.findElement(By.xpath("//*[@name=\"crm_project[manager]\"]/option[20]"));
            ManagerName.click();
            Thread.sleep(8000);
            WebElement Save = driver1.findElement(By.xpath("//button[contains(., 'Сохранить и закрыть')]"));
            Save.click();
            Thread.sleep(100);

//           driver1.quit();






        }
    }
