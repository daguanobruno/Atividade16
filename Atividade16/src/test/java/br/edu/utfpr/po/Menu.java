package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author andreendo
 */
public class Menu extends BasePage {
    
    @FindBy(css = "a[title='home page']")
    WebElement home;
    
    @FindBy(css = "a[title='find owners']")
    private WebElement findOwners;
    
    @FindBy(css = "a[title='veterinarians']")
    WebElement veterinarians;
    
    @FindBy(css = "a[title='trigger a RuntimeException to see how it is handled']")
    WebElement error;
    
    @FindBy(className = "navbar-toggle")
    WebElement menuButton;
 
    public Menu(WebDriver driver) {
        super(driver);
    }
    
    public Teste1 goToFindOwners() {
        clickMenuOption(findOwners);
        return new Teste1(driver);
    }

    public VeterinariansPage goToVeterinarians() {
        clickMenuOption(veterinarians);
        return new VeterinariansPage(driver);
    }    
    
    public ErrorPage goToError() {
        clickMenuOption(error);
        return new ErrorPage(driver);
    }   
    
    public Redmine goToHome() {
        clickMenuOption(home);
        return new Redmine(driver);
    }    
    
    private void clickMenuOption(WebElement menuOption) {
        //menu hides the options -- responsive page
        if(! menuOption.isDisplayed()) {
            menuButton.click();
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( ExpectedConditions.elementToBeClickable(menuOption) );
        menuOption.click();
    }
}
