package Stranice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pocetna extends Model {

	public Pocetna(WebDriver driver) {
		super(driver);
		
	}
@FindBy(id = "input_post")
WebElement inputOcemuRazmisljas;

@FindBy(id = "postovanje")
WebElement postDugme;

@FindBy(xpath = "//*[@id=\'obrisi_post\']")
WebElement obrisiPost;

@FindBy(css = "#navbarText > ul > li:nth-child(1) > a")
WebElement pocetnaDugme;

@FindBy(xpath = "//*[@id=\'navbarText\']/ul/li[2]/a")
WebElement ProfilDugme;

@FindBy(id = "navbarDropdown")
WebElement podesavanjaDugme;

@FindBy(id = "Licni podaci")
WebElement licniPodaciDugme;

@FindBy(id = "promena_lozinke")
WebElement promenaLozinkeDugme;

@FindBy(xpath = "//*[@id=\'navbarText\']/ul/li[4]/div/a[3]")
WebElement izadjiDugme;

@FindBy(id = "polje_pretrage")
WebElement searchPolje;

@FindBy(id = "dugme_pretrage")
WebElement searchDugme;

@FindBy (id = "post_prostor")
List<WebElement> postProstor;

@FindBy(id = "label_slika")
WebElement profilSlika;

@FindBy(id = "profilna_slika")
WebElement uploadSlika;

@FindBy(id = "dodaj_promeni_sliku")
WebElement dodajSliku;

@FindBy(id = "rezultati_pretrage")
WebElement rezultatiPretrage;

@FindBy(xpath = "//*[@id=\'gotova_pretraga\']")
WebElement gotovaPretraga;

@FindBy(id = "sliku_dodaj")
WebElement dodajSlikuPolje;


public void pocetnaClick() {
	pocetnaDugme.click();
}

public void dodajSlikuPolje() {
	dodajSlikuPolje.click();
	
}

public void promenaSlike() {
	profilSlika.click();
	uploadSlika.sendKeys("C:\\Users\\Danijel Jovanovic\\Desktop\\Slike\\IMG_20180731_233652.jpg");
	dodajSliku.click();
	
}
public void Podesavanja() {
	podesavanjaDugme.click();
	licniPodaciDugme.click();
	
}

public void pretragaLosa() {
	searchPolje.click();
	searchPolje.sendKeys("nistavilo");
	searchDugme.click();
	
	
}
public void pretragaDobraSamoIme() {
	searchPolje.click();
	searchPolje.sendKeys("Marija");
	searchDugme.click();
	
}
public void pretragaImePrezime() {
	searchPolje.click();
	searchPolje.sendKeys("Marija Radosavljevic");
	searchDugme.click();
	
}
public void pocetnaPolje(String inputRazmisljas) {
	
	this.inputOcemuRazmisljas.sendKeys(inputRazmisljas);
	postDugme.click();
	
}

public void profilClick() {
	ProfilDugme.click();
	
}
public void deletePost() {
	obrisiPost.click();
}

public boolean pocetnaAssert() {
	return inputOcemuRazmisljas.isDisplayed();
}
public boolean profileAssert () {
	return profilSlika.isDisplayed();
}
public boolean rezultati() {
	return rezultatiPretrage.isDisplayed();
}
public boolean gotovaPretraga() {
	return gotovaPretraga.isDisplayed();
}
public boolean losaPretraga() {
	return !gotovaPretraga.isDisplayed();
}
}
