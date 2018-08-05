package com.leeg.callcenteralmundo.logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LogicaGeneralTest {
    
    public LogicaGeneralTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAleatoriosEntre5y10() {

        Integer min = 5;
        Integer max = 11;
        
        for (int i = 0; i < 10; i++) {
            Integer aleatorioGenerado = LogicaGeneral.generarAleatorio(min, max);
            System.out.println("aleatorioGenerado = " + aleatorioGenerado);
            Assert.assertTrue(aleatorioGenerado >= min && aleatorioGenerado <= max);
        }
        
    }
    
}
