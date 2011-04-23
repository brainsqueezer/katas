import static org.junit.Assert.*;

import org.junit.Test;



public class CalculoDeIngresosDeUnaCiudad {
	
	int precioKiloVieiras = 500;
	int precioKiloPercebes = 0;
	int precioKiloCentollos = 450;
	@Test
	public void debeDarnosLosIngresosGeneradosPorUnProductoEnUnaCiudad() {
		int cantidadVieiras = 50;
		int cantidadPercebes = 100;
		int cantidadCentollos = 50;
		int precioVenta = precioVenta(cantidadVieiras, cantidadPercebes, cantidadCentollos);
		assertEquals(47500,precioVenta);
	}
	public int precioVenta(int cantidadVieiras, int cantidadPercebes, int cantidadCentollos){


		
		int precioVentaVieiras = cantidadVieiras*precioKiloVieiras;
		int precioVentaPercebes = cantidadPercebes*precioKiloPercebes;
		int precioVentaCentollos = cantidadCentollos*precioKiloCentollos;
		int precioVenta = precioVentaVieiras+precioVentaPercebes+precioVentaCentollos;
		return precioVenta;
	}
}




