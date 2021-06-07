import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.nashorn.internal.ir.annotations.Ignore;


public class TesteWejump {
	
	private WebDriver driver;
	private DSL dsl;
	
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chromedriver","/usr/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wejump-automation-test.github.io/qa-test/");
		dsl    = new DSL(driver);
		
		}
	@After 
	public void finaliza() {
		driver.quit();
	}
	@Test // esse teste valida se os botoes foram clicados corretamente e se nao estao sendo mostrados
	public void validaBtn() {
		// metodo para clicar nos botoes
		dsl.clicarBtn("//div[@id='panel_body_one']//button[@id='btn_one']");
		dsl.clicarBtn("//div[@id='panel_body_one']//button[@id='btn_two']");
		dsl.clicarBtn("//div[@id='panel_body_one']//button[@id='btn_link']");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		 // metodo para verificar se nao estao sendo mostrados
		Assert.assertFalse(dsl.botaoPresente("//div[@id='panel_body_one']//button[@id='btn_one']"));
		Assert.assertFalse(dsl.botaoPresente("//div[@id='panel_body_one']//button[@id='btn_two']"));
		Assert.assertFalse(dsl.botaoPresente("//div[@id='panel_body_one']//button[@id='btn_link']"));
	}
	
	@Test // esse teste valida se os botoes dentro do iframe_buttons foram clicados e se nao estao sendo mostrados
	public void validaIframeBtn() {
		// alterando a foco do selenium para o iframe
		driver.switchTo().frame(0);
		// metodo para clicar nos botoes
		dsl.clicarBtn("//div[@class='col-sm-12']//button[@id='btn_one']");
		dsl.clicarBtn("//div[@class='col-sm-12']//button[@id='btn_two']");
		dsl.clicarBtn("//div[@class='col-sm-12']//button[@id='btn_link']");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		// metodo para verificar se os botoes estao presentes
		Assert.assertFalse(dsl.botaoPresente("//div[@class='col-sm-12']//button[@id='btn_one']"));
		Assert.assertFalse(dsl.botaoPresente("//div[@class='col-sm-12']//button[@id='btn_two']"));
		Assert.assertFalse(dsl.botaoPresente("//div[@class='col-sm-12']//button[@id='btn_link']"));
	}
	
	@Test // esse teste valida se o nome foi inserido corretamente se o botao foi clicado, se o combo foi selecionado corretamente
		//e se a imagem do selenium esta prensente.
	public void validaBtnChekSelectImg() {
		// escreve no campo first_name
		dsl.inserirNome("first_name","Hudson"); 
		// clica no botao 1
		dsl.clicarBtn("//div[@id='panel_body_one']//button[contains(text(),'One')]");
		//seleciona no combo
		dsl.selecionarCombo("select_box", "option_two");
		// marca a opcao com um click
		dsl.selecionarOpcao("opt_three");
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// verifica se o nome foi inserido corretamente
		Assert.assertEquals("Hudson", dsl.obterValorCampo("first_name"));
		// verifica se o botão clicado esta presente 
		Assert.assertFalse(dsl.botaoPresente("//div[@id='panel_body_one']//button[contains(text(),'One')]"));
		// verifica se a opcao selecionada esta correta
		Assert.assertEquals("ExampleTwo", dsl.ObterValorCombo("select_box"));
		//verifica se a opcao clicada esta correta
		Assert.assertTrue(dsl.verificaOpcao("opt_three"));
		// verifica se a imagem do selenium esta presente
		Assert.assertTrue(driver.findElement(By.className("img-responsive-center-block")).isDisplayed());
	}
}
