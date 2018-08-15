package Testovi;

import org.testng.Assert;
import org.testng.annotations.Test;
import Stranice.Pocetna;

public class PocetnaTest extends Browser {
	
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	String url = "https://faceforfun.000webhostapp.com/profil.php";
	String unosRazmisljas = "Ne razmisljam ";
	Pocetna pocetna;
	
	@Test(priority = 11)
	public void PocetnaField() {
		pocetna = new Pocetna(driver);
		driver.get(url);
		pocetna.pocetnaClick();
		Assert.assertTrue(pocetna.pocetnaAssert());
			
	}
	
	@Test(priority = 12)
	public void pocetnaRaz() {
		pocetna = new Pocetna(driver);
		driver.get(url);
		pocetna.pocetnaClick();
		pocetna.pocetnaPolje(unosRazmisljas);
		sleep(3);
//		pocetna.deletePost();
	//	sleep(4);
		
	}
	@Test(priority = 13)
	public void profilClick() {
		pocetna = new Pocetna(driver);
		driver.get(url);
		pocetna.profilClick();
		sleep(2);
		Assert.assertTrue(pocetna.profileAssert());
		
		
	}
	@Test(priority = 14)
	public void profileStatus() {
		pocetna = new Pocetna(driver);
		driver.get(url);
		pocetna.profilClick();
		pocetna.pocetnaPolje("Stvarno ne razmisljam");
		System.out.println("Warning : Ispisao je ");
		
		
	}
	@Test(priority = 15)
	public void promeniProfilnu() {
		pocetna = new Pocetna(driver);
		driver.get(url);
		pocetna.profilClick();
		pocetna.promenaSlike();
		sleep(3);
		driver.navigate().back();
		System.out.println("Warning: Upload Done");
		
	}
 @Test (priority = 16)
 public void losaPretraga() {
	 pocetna = new Pocetna(driver);
	 driver.get(url);
	 pocetna.profilClick();
	 pocetna.pretragaLosa();
	 sleep(2);
	
	 
 }
 @Test (priority = 17)
 public void dobraSamoIme() {
	 pocetna = new Pocetna(driver);
	 driver.get(url);
	 pocetna.profilClick();
	 pocetna.pretragaDobraSamoIme();
	 sleep(3);
	 Assert.assertTrue(pocetna.gotovaPretraga());
 }
 @Test (priority = 18)
 public void dobroImePrezime() {
	 pocetna = new Pocetna(driver);
	 driver.get(url);
	 pocetna.profilClick();
	 pocetna.pretragaImePrezime();
	 sleep(2);
	
	 }
 @Test (priority = 19)
 public void dodajSlikuPolje() {
	 pocetna = new Pocetna(driver);
	 driver.get(url);
	 pocetna.dodajSlikuPolje();
	 Assert.assertTrue(pocetna.profileAssert());
	 System.out.println("WARNING: Dugme dodaj sliku ne radi");
 }
 
	 
 }
 

