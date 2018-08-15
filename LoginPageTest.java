package Testovi;

import org.junit.Assert;
import org.testng.annotations.Test;
import Stranice.LoginPage;

public class LoginPageTest extends Browser {
	
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
 
	String url = "https://faceforfun.000webhostapp.com/";
	String goodUserName = "dachatest";
	String goodPassword = "Dacha0649780332;";
	String wrongUserName = "fafnuasfafa";
	String wrongPassword = "dfdsgsdgsdgs";
	String CAPS = "DACHATEST";
	
	LoginPage logIn;
	
@Test(priority = 0)
public void samoPrijaviSe() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.prijaviteSe();
	Assert.assertTrue(logIn.Naslov());
}
@Test(priority = 1)
public void samoUserName() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(goodUserName, "");
	logIn.prijaviteSe();
	Assert.assertTrue(logIn.Naslov());
	}
@Test(priority = 2)
public void samoPassword() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs("", goodPassword);
	Assert.assertTrue(logIn.Naslov());
}

@Test(priority = 3)
public void wrongPassword() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(goodUserName, wrongPassword);
	Assert.assertTrue(logIn.Naslov());
	
}

@Test(priority = 4)
public void registrujSe() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.registrujSe();
	sleep (3);
	Assert.assertTrue(logIn.registrujAssert());
	
}

@Test(priority = 5)
public void zaboravljenPassword() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.zaboravljenaSifra();
	sleep(3);
	Assert.assertTrue(logIn.zaboravljenAssert());
	
	
}

@Test(priority = 6)
public void capsLockOn() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(CAPS, goodPassword);
	logIn.prijaviteSe();
	Assert.assertTrue(logIn.loginSucc());
	System.out.println("WARNING - Loguje se sa CAPSLOCK");	
}
@Test(priority = 7)
public void regLosMail() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.registrujSe();
	logIn.registracija("Ana", "Jovanovic", "anaovnoad", "AnaJ92", "Anajov92.", "Anajov92.");
	logIn.regDugme();
	Assert.assertTrue(logIn.regAssert());
	
}
@Test(priority = 8)
public void regLosaPotvrda() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.registrujSe();
	logIn.registracija("Ana", "Jovanovic", "anajovjana@fmail.com", "AnaJ92", "Anajov92.", "Anaoffasf");
	logIn.regDugme();
	Assert.assertTrue(logIn.regAssert());
}
@Test(priority = 9)
public void regDobriUnosi() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.registrujSe();
	logIn.registracija("Ana", "Jovanovic", "anajovjana@gmail.com", "AnaJ92", "Anajov92.", "Anajov92.");
	//logIn.regDugme();
//	Assert.assertTrue(logIn.loginSucc());
}



@Test(priority = 10)
public void goodInputs() {
	
	logIn = new LoginPage(driver);
	
	driver.get(url);
	logIn.signInInputs(goodUserName, goodPassword);
	logIn.prijaviteSe();
	Assert.assertTrue(logIn.loginSucc());
	}
	
	
}

