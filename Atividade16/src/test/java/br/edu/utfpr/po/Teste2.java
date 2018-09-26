/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class Teste2 extends PetClinicBasePage{
    
    public Teste2(WebDriver driver) {
        super(driver);
    }
    
    
    @FindBy(xpath = "//*[@id=\"search-form\"]/p/input")
    WebElement commit1;

    @FindBy(xpath = "//*[@id=\"search-form\"]/p/input")
    WebElement commit2;

    @FindBy(xpath = "//*[@id=\"quick-search\"]/form/label/a")
    WebElement busca1;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement busca2;
    
    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement busca3;
    
    @FindBy(xpath = "//*[@id=\"content\"]/h3")
    WebElement resultado;
    
     public Teste2 setResultado(String resultado) {

        this.resultado.clear();
        this.resultado.sendKeys(resultado);
        return this;
    }
     
      public ListOwnersPage clickCommit() {
        commit1.click();
        return new ListOwnersPage(driver);
    }

    public ListOwnersPage clickCommit2() {
        commit1.click();
        return new ListOwnersPage(driver);
    }

    public ListOwnersPage clickCommit3() {
        commit2.click();
        return new ListOwnersPage(driver);
    }
    
       public ListOwnersPage clickBusca1() {
        busca1.click();
        return new ListOwnersPage(driver);
    }

    public ListOwnersPage clickBusca2() {
        busca2.click();
        return new ListOwnersPage(driver);
    }

    public ListOwnersPage clickBusca3() {
        busca3.click();
        return new ListOwnersPage(driver);
    }
}
