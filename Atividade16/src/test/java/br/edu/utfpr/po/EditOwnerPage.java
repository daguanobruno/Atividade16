package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author andreendo
 */
public class EditOwnerPage extends PetClinicBasePage {
    //no annotation needed here -> matches html id with var name
    WebElement cadastrar;
    
    WebElement usuario;
    
    WebElement senha;
    
    WebElement confirmacao;
    
    WebElement nome;

    WebElement sobrenome;

    WebElement email;
    
    WebElement mensagem;
    
    @FindBy(xpath = "//*[@id=\"new_user\"]/input[3]")
    WebElement commit;

    public EditOwnerPage(WebDriver driver) {
        super(driver);
    }    

    public EditOwnerPage setUsuario(String usuario) {
        this.usuario.clear();
        this.usuario.sendKeys(usuario);
        return this;
    }
    
    public EditOwnerPage setSenha(String senha) {
        this.senha.clear();
        this.senha.sendKeys(senha);
        return this;
    }

    public EditOwnerPage setConfirmacao(String confirmacao) {
        this.confirmacao.clear();
        this.confirmacao.sendKeys(confirmacao);
        return this;
    }

    public EditOwnerPage setNome(String nome) {
        this.nome.clear();
        this.nome.sendKeys(nome);
        return this;
    }

    public EditOwnerPage setSobrenome(String sobrenome) {
        this.sobrenome.clear();
        this.sobrenome.sendKeys(sobrenome);
        return this;
    }
    
    public EditOwnerPage setEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
        return this;
    }
    
    public OwnerInformationPage addCadastro() {
        cadastrar.click();
        return new OwnerInformationPage(driver);
    }
    
    public EditOwnerPage addCommit() {
        commit.click();
        return this;
    }    

    public String getUsuario() {
        return usuario.getAttribute("value");
    }
    
    
    public String getSenha() {
        return senha.getAttribute("value");
    }
    
        public String getConfirmacao() {
        return confirmacao.getAttribute("value");
    }
    
     public String getNome() {
        return nome.getAttribute("value");
    }

    public String getSobrenome() {
        return sobrenome.getAttribute("value");
    }

    public String getEmail() {
        return email.getAttribute("value");
    }

    public String getMensagem() {
        return mensagem.getAttribute("value");
    }

    
    
}