package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {
		
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePiedraPierdeConSpock() {
		
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Piedra pierde con spock", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));	
	}

	@Test
	public void quePiedraPierdeConPapel() {
		
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Piedra pierda con papel", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}	
	
	@Test
	public void quePapelCubrePiedra() {
		
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel cubre piedra", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}	
		
	@Test
	public void quePiedraAplastaLagarto() {
		
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Piedra aplasta lagarto", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queLagartoPierdeConPiedra() {
		
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Lagarto pierde con piedra", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePiedraAplastaTijera() {
		
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra aplasta Tijera", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queTijeraPierdeConPiedra() {
		
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Tijera pierde con piedra", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePiedraEmpataConPiedra() {
		
		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra empata con piedra", Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queSpockEmpataConSpock() {
		
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock empata con spock", Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queSpockPierdeConPapel() {
		
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Spock piede con papel", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePapelRefutaSpock() {
		
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Papel refuta Spock", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queSpockPierdeConLagarto() {
		
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock pierde con lagarto", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queLagartoEnvenenaSpock() {
		
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto envenena spock", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queSpockDestrozaTijera() {
		
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock destroza tijera", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queTijeraPierdeConSpock() {
		
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Tijera pierde con spock", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
		
	@Test
	public void quePapelEmpataConPapel() {
		
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel empata con papel", Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePapelPierdeConLagarto() {
		
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Papel pierde con lagarto", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queLagartoComePapel() {
		
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto come papel", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void quePapelPierdeConTijera() {
		
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Papel pierde con tijera", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queTijeraCortaPapel() {
		
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Tijera corta papel", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queLagartoEmpataConLagarto() {
		
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto empata con lagarto", Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queLagartoPierdeConTijera() {
		
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Lagarto pierde con tijera", Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queTijeraDecapitaLagarto() {
		
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Tijera decapita lagarto", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queTijeraEmpataConTijera() {
		
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera empata con tijera", Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
}




