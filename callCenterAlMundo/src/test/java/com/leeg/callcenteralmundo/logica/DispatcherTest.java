package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Empleados;
import com.leeg.callcenteralmundo.modelo.LlamadaTelefonica;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DispatcherTest {
    
    @InjectMocks
    Dispatcher dispatcher;
    
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
    public void testDispatchCall() {
            
        Empleados.llenarEmpleados();

        LlamadaTelefonica llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 1");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Pepito Perez", llamadaTelefonica.getContestador().getNombre());

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 2");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Armando Casas", llamadaTelefonica.getContestador().getNombre());

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 3");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Elver Gomez", llamadaTelefonica.getContestador().getNombre());        

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 4");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Juan Pigna", llamadaTelefonica.getContestador().getNombre());

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 5");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Ame Las", llamadaTelefonica.getContestador().getNombre());

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 6");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Aran Danos", llamadaTelefonica.getContestador().getNombre());        

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 7");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Tropi cana", llamadaTelefonica.getContestador().getNombre());        

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 8");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Andrea Juanpi", llamadaTelefonica.getContestador().getNombre());        

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 9");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Esteban quito", llamadaTelefonica.getContestador().getNombre());

        llamadaTelefonica = new LlamadaTelefonica();
        llamadaTelefonica.setIdLlamada("Llamada 10");
        llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
        dispatcher.dispatchCall(llamadaTelefonica);
        assertEquals("Popo San", llamadaTelefonica.getContestador().getNombre());
    }
    
}
