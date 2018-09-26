/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Teste3 extends PetClinicBasePage {

    public Teste3(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[3]/a")
    WebElement ajuda;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul[8]/li[6]/a")
    WebElement calendario;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/p[1]")
    WebElement texto;
    
    public Teste3 setAjuda(String ajuda) {

        this.ajuda.clear();
        this.ajuda.sendKeys(ajuda);
        return this;
    }

   

    public Teste3 setTexto(String texto) {

        this.texto.clear();
        this.texto.sendKeys(texto);
        return this;
    }

    public Teste3 setCalendario(String calendario) {

        this.calendario.clear();
        this.calendario.sendKeys(calendario);
        return this;
    }
}
