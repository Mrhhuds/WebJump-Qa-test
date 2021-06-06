import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
			this.driver = driver;
	}
	
	public void clicarBtn(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void clicarLink(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void inserirNome(String id_campo, String nome) {
		driver.findElement(By.id(id_campo)).sendKeys(nome);
	}
	
	public String obterValorCampo(String id_campo) {
		return	driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public void selecionarOpcao(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void selecionarCombo(String id, String valor) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByValue(valor);
	}
	
	public String ObterValorCombo(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public boolean botaoPresente(String xpath) {
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	public boolean linkPresente(String xpath) {
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	
	public boolean verificaOpcao(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
}
