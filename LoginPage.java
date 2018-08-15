package Stranice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Model {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "posalji")
	WebElement prijaviSe;
	
	@FindBy(xpath = "//*[@id=\'forma\']/button[2]")
	WebElement registrujSe;
	
	@FindBy(xpath = "//*[@id=\'forma\']/button[3]")
	WebElement zaboravljenPassword;
	
	@FindBy(id = "naslov")
	WebElement naslovnaSlika;
	
	@FindBy(id = "reset_rg")
	WebElement registracijaProzor;
	
	@FindBy(id = "email_za_obnovu")
	WebElement mailZaObnovu;
	
	@FindBy(id = "polje_pretrage")
	WebElement poljePretrage;
	
	@FindBy (id = "ime_rg")
	WebElement regIme;
	
	@FindBy (id = "prezime_rg")
	WebElement regPrezime;
	
	@FindBy (id = "email_rg")
	WebElement regEmail;
	
	@FindBy(id = "korisnicko_ime_rg")
	WebElement regUsername;
	
	@FindBy(id = "lozinka_rg")
	WebElement regLozinka;
	
	@FindBy(id = "potvrda_lozinke_rg")
	WebElement regPotvrda;
	
	@FindBy(id = "registracija_dugme")
	WebElement regDugme;
	
	
	public void signInInputs(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void prijaviteSe() {
		prijaviSe.click();
	}
	public void registrujSe() {
		registrujSe.click();
		}
	public void zaboravljenaSifra() {
		zaboravljenPassword.click();
		
	}
	public void registracija(String Ime,String Prezime,String regEmail,String regKorisnicko,String regPass,String regPotvrda) {
		
		this.regIme.sendKeys(Ime);
		this.regPrezime.sendKeys(Prezime);
		this.regEmail.sendKeys(regEmail);
		this.regUsername.sendKeys(regKorisnicko);
		this.regLozinka.sendKeys(regPass);
		this.regPotvrda.sendKeys(regPotvrda);
		}
	public void regDugme() {
		regDugme.click();
	}
	
	public boolean loginSucc() {
		return poljePretrage.isDisplayed();
	}
	public boolean Naslov() {
		return naslovnaSlika.isDisplayed();
	}
	public boolean registrujAssert() {
		return registracijaProzor.isDisplayed();
	}
	public boolean zaboravljenAssert() {
		return mailZaObnovu.isDisplayed();
	}
	public boolean regAssert () {
		return regPotvrda.isDisplayed();
	}
}

