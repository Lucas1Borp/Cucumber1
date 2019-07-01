import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Compra {
	protected static WebDriver driver;

	@Dado("^Que ao acessar um site$")
	public void queAoAcessarUmSite() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.cs-cart.com/stores/feea0895f9d54fcf/");
		Thread.sleep(5000);
	}

	@Quando("^Clicar em um produto$")
	public void clicarEmUmProduto() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"det_img_23000247\"]")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"opener_call_request_247\"]/span")).click();
		Thread.sleep(1500);
	}

	@Então("^Devo preencher o cadastro e-mail$")
	public void devoPreencherOCadastroEMail() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"call_data_call_request_247_email\"]"))
				.sendKeys("lucas.a.b.p1@gmail.com");

		Thread.sleep(1500);
	}

	@Quando("^clicar em submeter$")
	public void clicarEmSubmeter() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"form_call_request_247\"]/div[8]/button")).click();
		Thread.sleep(5000);
	}

	@Entao("^Devo finalizar a compra$")
	public void devoFinalizarACompra() throws Throwable {
		driver.quit();
	}

}
