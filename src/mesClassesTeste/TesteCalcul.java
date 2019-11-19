package mesClassesTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mesClasses.Calcul;

public class TesteCalcul {

  //creation de l'objet	
	Calcul c1 ;
	@Before
	public  void setUpBeforeClass() throws Exception {
	//instanciation de l'objet
		c1 = new Calcul();
	}                                                              
                                                                                                 
	@Test                                                          
	public void testAddition() {                                   
	//teste de la methode addition                                 
		assertEquals(4, c1.addition(2, 2), 0);                     
		assertEquals(3.5, c1.addition(2, 1.5), 0);                 
		assertEquals(-3, c1.addition(-6, 3), 0);                   
		assertEquals(0, c1.addition(2.4, -2.4), 0);                
	}                                                              
                                                                   
	@Test                                                          
	public void testMultiplication() {                             
		//teste de la methode multiplication                       
				assertEquals(4, c1.multiplication(2, 2), 0);             
				assertEquals(3, c1.multiplication(2, 1.5), 0);         
				assertEquals(-18, c1.multiplication(-6, 3), 0);           
				assertEquals(-5.76, c1.multiplication(2.4, -2.4), 0);
	}

}
