package br.edu.utfpr;

import br.edu.utfpr.po.ErrorPage;
import br.edu.utfpr.po.FindOwnerPage;
import br.edu.utfpr.po.Redmine;
import br.edu.utfpr.po.VeterinariansPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteTest {

    private static int scId = 0;

    WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.close();
    }

    //@Test
    public void cadastrar() {
        
        Redmine homePage = new Redmine(driver);

        WebElement cadastrar = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/p[2]/a"));
        cadastrar.click();

        WebElement usuario = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
        usuario.sendKeys("Bruno");

        WebElement senha = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
        senha.sendKeys("Bruno");

        WebElement confirmacao = driver.findElement(By.xpath("//*[@id=\"user_password_confirmation\"]"));
        confirmacao.sendKeys("Bruno");

        WebElement nome = driver.findElement(By.xpath("//*[@id=\"user_firstname\"]"));
        nome.sendKeys("Bruno");

        WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\"user_lastname\"]"));
        sobrenome.sendKeys("Daguano");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"user_mail\"]"));
        email.sendKeys("bruno_daguano@hotmail.com");

        WebElement commit = driver.findElement(By.xpath("//*[@id=\"new_user\"]/input[3]"));
        commit.click();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id=\"flash_notice\"]"));

        assertEquals(mensagem.getTagName().trim(), "Sua conta foi ativada. Você pode acessá-la agora.");
    }

    @Test
    public void pesquisarTeste() {

        Redmine homePage = new Redmine(driver);
        
        WebElement busca = driver.findElement(By.xpath("//*[@id=\"quick-search\"]/form/label/a"));
        busca.click();

        WebElement busca1 = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
        busca1.sendKeys("Teste de Software");

        WebElement commit = driver.findElement(By.xpath("//*[@id=\"search-form\"]/p/input"));
        commit.click();

        WebElement segundaBusca = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
        segundaBusca.clear();
        segundaBusca.sendKeys("Teste");

        WebElement commit2 = driver.findElement(By.xpath("//*[@id=\"search-form\"]/p/input"));
        commit2.click();

        WebElement resultado = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));

        assertEquals(resultado.getText().trim(), "Resultados (24)");

    }

    //@Test
    public void calendario() {

        Redmine homePage = new Redmine(driver);
        WebElement ajuda = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a"));
        ajuda.click();

        WebElement calendario = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/ul[8]/li[6]/a"));
        calendario.click();

        WebElement texto = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/p[1]"));

        assertEquals(texto.getText().trim(), "The calendar provides an overview of the current project as"
                + " a monthly view. This view displays all the issues that have at least a start date and "
                + "indicates their start date and (if available) their due date. The calendar also displays "
                + "all versions which have a due date set.");
    }

    //@Test
    public void recuperarSenha() {

        Redmine homePage = new Redmine(driver);
        
        WebElement entrar = driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]\n"));
        entrar.click();

        WebElement usuario = driver.findElement(By.id("username"));
        usuario.sendKeys("Bruno");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Augusto");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input"));
        submit.click();

        WebElement mensagem1 = driver.findElement(By.xpath("//*[@id=\"flash_error\"]"));
        assertEquals(mensagem1.getText().trim(), "Usuário ou senha inválido.");

        WebElement commit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[1]/a"));
        commit.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"mail\"]"));
        email.sendKeys("bruno_daguano@hotmail.com");

        WebElement commit2 = driver.findElement(By.name("commit"));
        commit2.click();

        WebElement mensagem2 = driver.findElement(By.id("flash_notice"));
        assertEquals(mensagem2.getText().trim(), "Um e-mail com instruções para escolher uma nova senha foi enviado para você.");
    }
}
