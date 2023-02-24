/**
 * 
 */
package com.gustavo.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gustavo.projectspringdesktop.dao.DisqueraDAO;

/**
 * Clase de prueba unitaria que permite realizar pruebas con el framework spring.
 * @author Calistos
 *
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) ac.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		System.out.println("Contexto cargado con éxito." + "El objeto: " + disqueraDAO);
		
		//PROPERTIES:
		Properties pt = (Properties) ac.getBean("properties");
		
		System.out.println(pt.get("spring-username"));
	}

}
