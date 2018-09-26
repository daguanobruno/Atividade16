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
public class Teste1 extends PetClinicBasePage{
    
    public Teste1(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/p[2]/a")
    WebElement cadastrar;
    
    @FindBy(xpath = "//*[@id=\"user_login\"]")
    WebElement usuario;
    
    @FindBy(xpath = "//*[@id=\"user_password\"]")
    WebElement senha;

    @FindBy(xpath = "//*[@id=\"user_password_confirmation\"]")
    WebElement confirmacao;

    @FindBy(xpath = "//*[@id=\"user_lastname\"]")
    WebElement sobrenome;

    @FindBy(xpath = "//*[@id=\"user_firstname\"]")
    WebElement nome;

    @FindBy(xpath = "//*[@id=\"user_mail\"]")
    WebElement email;

   

    @FindBy(xpath = "\"//*[@id=\\\"flash_notice\\\"]")
    WebElement mensagem;
    
    public Teste1 setPrimeiroNome(String nome) {

        this.nome.clear();
        this.nome.sendKeys(nome);
        return this;
    }

    public Teste1 setSobrenome(String sobrenome) {

        this.sobrenome.clear();
        this.sobrenome.sendKeys(sobrenome);
        return this;
    }

    public Teste1 setUsuario(String usuario) {

        this.usuario.clear();
        this.usuario.sendKeys(usuario);
        return this;
    }

    public Teste1 setSenha(String senha) {

        this.senha.clear();
        this.senha.sendKeys(senha);
        return this;
    }

    public Teste1 setCadastrar(String cadastrar) {

        this.cadastrar.clear();
        this.cadastrar.sendKeys(cadastrar);
        return this;
    }

    public Teste1 setConfirmacao(String confirmacao) {

        this.confirmacao.clear();
        this.confirmacao.sendKeys(confirmacao);
        return this;
    }

    public Teste1 setMensagem1(String mensagem1) {

        this.mensagem.clear();
        this.mensagem.sendKeys(mensagem1);
        return this;
    }
    
      public Teste1 setEmail(String email) {

        this.email.clear();
        this.email.sendKeys(email);
        return this;
    }
      
    public Teste1 clickCommit() {
        commit.click();
        return new Teste1(driver);
    }
}
