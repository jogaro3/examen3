/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3refactorizado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;



class CCuentaTest {
	CCcuenta miCuenta = new CCcuenta();

	@ParameterizedTest
	@CsvSource({"-10,1","-3,2","10,0"})
	@DisplayName("Caja Blanca - Ingresar")
	void testIngreso(double cant,int resul) {
		assertEquals(resul,miCuenta.ingresar(cant));
	}
}
/**
 *
 * @author persona
 */
    public class CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
}
