package main.brzevesti;

import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("http://bvtest.school.cubes.rs/admin");
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        
        WebElement passField = driver.findElement(By.name("password"));
        passField.sendKeys("cubesqa");
        
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        
//        System.out.println(driver.getTitle());
//        
//        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
//        signaturesLink.click();
//        System.out.println(driver.getTitle());
//        
        WebElement categoriesLink = driver.findElement(By.partialLinkText("gori"));
        categoriesLink.click();
        System.out.println(driver.getTitle());
        
//        WebElement addCategoriesLink = driver.findElement(By.className("btn-default"));
//        addCategoriesLink.click();
        
        WebElement addCategoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addCategoryButton.click();
        
        WebElement addCategoryTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        addCategoryTitle.sendKeys(Helper.getRandomText());
        
        WebElement saveCategoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("save-category-button")));
        saveCategoryButton.click();
//        
//        WebElement regionsLink = driver.findElement(By.linkText("Regions"));
//        regionsLink.click();
//        System.out.println(driver.getTitle());
//        
//        WebElement addRegionsButton = driver.findElement(By.className("btn-default"));
//        addRegionsButton.click();
//        
//        WebElement addRegionTitle = driver.findElement(By.id("title"));
//        addRegionTitle.sendKeys("Nova Regija");
//        
//        WebElement saveRegionButton = driver.findElement(By.id("save-region-button"));
//        saveRegionButton.click();
//         
//        WebElement portalsLink = driver.findElement(By.linkText("Portals"));
//        portalsLink.click();
//        System.out.println(driver.getTitle());
//        
//        WebElement addPortalButton = driver.findElement(By.className("btn-default"));
//        addPortalButton.click();
//        
//        WebElement addPortalTitle = driver.findElement(By.id("title"));
//        addPortalTitle.sendKeys("Novi Portal");
//        
//        WebElement addPortalUrl = driver.findElement(By.id("url"));
//        addPortalUrl.sendKeys("www.noviportal.com");
//        
//        WebElement addPortalRegionDropdown = driver.findElement(By.name("region_id"));
//        addPortalRegionDropdown.click();
//        
//        WebElement addPortalRegionDropdownOption = driver.findElement(By.linkText("Nova Regija"));
//        addPortalRegionDropdownOption.click();
        
        
//        
//        WebElement sourcesLink = driver.findElement(By.linkText("Sources"));
//        sourcesLink.click();
//        System.out.println(driver.getTitle());
        
//        WebElement cubesLogOutLink = driver.findElement(By.className("dropdown-toggle"));
//        cubesLogOutLink.click();
//        
//        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
//        logoutLink.click();
//        
//        driver.quit();
    }
    
}
