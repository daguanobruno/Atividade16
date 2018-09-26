/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr;

import br.edu.utfpr.po.EditOwnerPage;
import br.edu.utfpr.po.ErrorPage;
import br.edu.utfpr.po.OwnerInformationPage;
import br.edu.utfpr.po.Redmine;
import br.edu.utfpr.po.Teste1;
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

public class RealizarCadastroTest {

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
        
        Teste1 teste1 = homePage.getMenu().goToFindOwners();
        EditOwnerPage editOwnerPage;        
        EditOwnerPage ownerInfoPage = editOwnerPage.setUsuario("Bruno")
                .setSenha("Augusto")
                .setConfirmacao("Augusto")
                .setNome("Bruno")
                .setSobrenome("Daguano")
                .addCommit();

        //assertEquals(mensagem.getTagName().trim(), "Sua conta foi ativada. Você pode acessá-la agora.");
    }
}
