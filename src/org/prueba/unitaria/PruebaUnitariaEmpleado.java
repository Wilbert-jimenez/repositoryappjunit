package org.prueba.unitaria;



import org.junit.jupiter.api.Test;
import org.servicios.empleado.ServicioEmpleado;

import junit.framework.TestCase;

/*1.- debemos heredar de TestCase
 * 2.- crear metodo Test()
 * todos los metodos deb
 * 
 * 
 * 
 */

class PruebaUnitariaEmpleado extends TestCase{
	
	ServicioEmpleado servicioEmpleado = null;

	@Test
	public void test() {
		servicioEmpleado = new ServicioEmpleado();
	}
	@Test
	public void salarioBonoEmpledo() {
		test();
		assertTrue(servicioEmpleado.salarioBonoEmpleado(20000.0, 5000.0)==25000.0);
	}
	
	@Test
	public void testSalarioPrestamoEmpleado() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamoEmpleado(20000.0, 2500.0), 12500.0);
		
	}
	

}
