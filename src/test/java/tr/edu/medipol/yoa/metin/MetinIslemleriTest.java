package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
		// GIVEN - On hazirliklar
        String orjinalMetin = "Uc tas hos     ho  saf  . . . ";
        
        // WHEN - Asil testi gerceklestir
        String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
        
        // THEN - Kontroller
        assertEquals("Uctashoshosaf...", sonuc);
	}

}
