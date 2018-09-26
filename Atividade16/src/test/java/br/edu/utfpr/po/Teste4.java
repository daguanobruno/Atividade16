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
public class Teste4 extends PetClinicBasePage {
    
    public Teste4(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[1]\n")
    WebElement entrar;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"flash_error\"]")
    WebElement mensagem2;

    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[1]/a")
    WebElement commit4;

    @FindBy(xpath = "//*[@id=\"mail\"]")
    WebElement email2;

    @FindBy(name = "commit")
    WebElement commit5;

    @FindBy(id = "flash_notice")
    WebElement flash_notice;

    public Teste4 setMensagem2(String mensagem2) {

        this.mensagem2.clear();
        this.mensagem2.sendKeys(mensagem2);
        return this;
    }

    

    public Teste4 setEntrar(String entrar) {

        this.entrar.clear();
        this.entrar.sendKeys(entrar);
        return this;
    }

    public Teste4 setUsername(String username) {

        this.username.clear();
        this.username.sendKeys(username);
        return this;
    }

    public Teste4 setPassword(String password) {

        this.password.clear();
        this.password.sendKeys(password);
        return this;
    }

  

    public Teste4 setEmail2(String email2) {

        this.email2.clear();
        this.email2.sendKeys(email2);
        return this;

    }

    public Teste4 setFlash_notice(String flash_notice) {

        this.flash_notice.clear();
        this.flash_notice.sendKeys(flash_notice);
        return this;
    }

   

    public ListOwnersPage clickCommit4() {
        commit4.click();
        return new ListOwnersPage(driver);
    }

    public ListOwnersPage clickCommit5() {
        commit5.click();
        return new ListOwnersPage(driver);
    }

 

    public ListOwnersPage clickSubimit() {
        submit.click();
        return new ListOwnersPage(driver);
    }
}
