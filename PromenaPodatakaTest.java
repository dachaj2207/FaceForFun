package Testovi;

import org.testng.Assert;
import org.testng.annotations.Test;
import Stranice.PromenaPodataka;

public class PromenaPodatakaTest extends Browser  {
	
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}}
	
	String url = "https://faceforfun.000webhostapp.com/profil.php";
	PromenaPodataka promena;
	String Ime = "Danijel";
	String Prezime = "Jovanovic";
	String Email = "bojant987@gmail.com";
	String Telefon = "069780332";
	String Rodjen = "25101989";
	String Mesto = "Ritopek";
	String Int = "Ogromno";
	
	@Test(priority = 20)
	public void ocisti1() {
		promena = new PromenaPodataka(driver);
		driver.get(url);
		promena.licniPodaci();
		sleep(2);
		promena.ocistiPolja();
		
	}
	
	@Test(priority = 21)
	public void promenaMusko () {
		promena = new PromenaPodataka(driver);
		driver.get(url);
		promena.licniPodaci();
		promena.promenaPodMusko(Ime, Prezime, Email, Telefon, Rodjen, Mesto, Int);
		
	}
	
	@Test(priority = 22)
	public void ocisti2() {
		promena = new PromenaPodataka(driver);
		driver.get(url);
		promena.licniPodaci();
		sleep(2);
		promena.ocistiPolja();
	}
	
	@Test(priority = 23)
	public void promenaZensko () {
		promena = new PromenaPodataka(driver);
		driver.get(url);
		promena.licniPodaci();
		promena.promenaPodZensko(Ime, Prezime, Email, Telefon, Rodjen, Mesto, Int);
		
		
	}
	
	@Test(priority = 24)
	public void promenaLozinke() {
		promena = new PromenaPodataka(driver);
		driver.get(url);
		promena.podClick();
		promena.promenaLozinke();
		Assert.assertFalse(promena.promenaAssert());
	}
	
	@Test(priority = 25)
	public void izadji() {
		promena = new PromenaPodataka(driver);
		driver.get(url);
		promena.podClick();
		promena.izadji();
		Assert.assertTrue(promena.naslovna());
		
	}
	
	
	
	
  
}
