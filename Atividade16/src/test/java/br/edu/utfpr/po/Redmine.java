package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author andreendo
 */
public class Redmine extends PetClinicBasePage {

    public Redmine(WebDriver driver) {
        super(driver);
        driver.get("http://demo.redmine.org/");
    }
}
