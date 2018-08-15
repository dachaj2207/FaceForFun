package Stranice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromenaPodataka extends Model  {

	public PromenaPodataka(WebDriver driver) {
		super(driver);
		
	}
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	@FindBy(id = "navbarDropdown")
	WebElement podesavanjaDugme;

	@FindBy(id = "Licni podaci")
	WebElement licniPodaciDugme;
	
	@FindBy(id = "ime_unos")
	WebElement podIme;
	
	@FindBy(id = "prezime_unos")
	WebElement podPrezime;
	
	@FindBy(id = "email_unos")
	WebElement podEmail;
	
	@FindBy(id = "telefon_unos")
	WebElement podTelefon;
	
	@FindBy(id = "godine_unos")
	WebElement podGodine;
	
	@FindBy(id = "Mesto_stanovanja_unos")
	WebElement podMesto;
	
	@FindBy(id = "Interesovanje_unos" )
	WebElement podInteresovanje;
	
	@FindBy (xpath = "//*[@id=\'registracija\']/div/div/div[2]/form/div[8]/div/div/input")
	WebElement podMusko;
	
	@FindBy (xpath = "//*[@id=\'registracija\']/div/div/div[2]/form/div[9]/div/div/input")
	WebElement podZensko;
	
	@FindBy(id = "izmena")
	WebElement podSacuvaj;
	
	@FindBy (xpath = "//*[@id=\'podaci\']/div[5]")
	WebElement podPol;
	
	@FindBy (id = "nova_lozinka")
	WebElement novaLozinka;
	
	@FindBy (id = "promena_lozinke")
	WebElement promenaLozinke;
	
	@FindBy(xpath = "//*[@id=\'navbarText\']/ul/li[4]/div/a[3]")
	WebElement podIzadji;
	
	@FindBy( id = "naslov")
	WebElement naslovna;
	
	String Text = podPol.getText();
	public void podClick() {
		podesavanjaDugme.click();
	}
	public void licniPodaci() {
		podesavanjaDugme.click();
		licniPodaciDugme.click();
		
	}
	public void ocistiPolja() {
		podIme.clear();
		podPrezime.clear();
		podEmail.clear();
		podTelefon.clear();
		podGodine.clear();
		podMesto.clear();
		podInteresovanje.clear();
		podSacuvaj.click();
	}
	
	public void promenaPodMusko(String Ime,String Prezime,String Email,String Telefon,String Godine,String Stanovanje,String Interesovanje) {
		
		
		this.podIme.sendKeys(Ime);
		this.podPrezime.sendKeys(Prezime);
		this.podEmail.sendKeys(Email);
		this.podTelefon.sendKeys(Telefon);
		this.podGodine.sendKeys(Godine);
		this.podMesto.sendKeys(Stanovanje);
		this.podInteresovanje.sendKeys(Interesovanje);
		podMusko.click();
		podSacuvaj.click();
		sleep(2);
		if(Text.contains("Musko")) {
			System.out.println("Warning: Menja pol dobro");
		}else {
			System.out.println("Warning: Ne menja pol dobro");
		}
	}
public void promenaPodZensko(String Ime,String Prezime,String Email,String Telefon,String Godine,String Stanovanje,String Interesovanje) {
	
	
	this.podIme.sendKeys(Ime);
	this.podPrezime.sendKeys(Prezime);
	this.podEmail.sendKeys(Email);
	this.podTelefon.sendKeys(Telefon);
	this.podGodine.sendKeys(Godine);
	this.podMesto.sendKeys(Stanovanje);
	this.podInteresovanje.sendKeys(Interesovanje);
	podZensko.click();
	podSacuvaj.click();
	sleep(2);
	if(Text.contains("Zensko")) {
		System.out.println("Warning: Menja pol dobro");
	}else {
		System.out.println("Warning: Ne menja pol dobro");
	}
}
public void promenaLozinke() {
	promenaLozinke.click();	
}
public void izadji() {
	podIzadji.click();
}
public boolean promenaAssert() {
	return novaLozinka.isDisplayed();
}
public boolean naslovna() {
	return naslovna.isDisplayed();
}
}
