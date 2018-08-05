package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Director;
import com.leeg.callcenteralmundo.modelo.Empleado;
import com.leeg.callcenteralmundo.modelo.Operador;
import com.leeg.callcenteralmundo.modelo.Supervisor;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
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
    
    private List<Empleado> empleados = new ArrayList<>();
    
    public DispatcherTest() {
        
        Operador operador = FabricaObjetos.crearOperador();
        operador.setNombre("Pepito Perez");
        operador.setAsignado(false);
        empleados.add(operador);
        
        Supervisor supervisor = FabricaObjetos.crearSupervisor();
        supervisor.setNombre("Juan Pigna");
        supervisor.setAsignado(false);
        empleados.add(supervisor);
        
        Director director = FabricaObjetos.crearDirector();
        director.setNombre("Tropi cana");
        director.setAsignado(false);
        empleados.add(director);
        
        operador = FabricaObjetos.crearOperador();
        operador.setNombre("Armando Casas");
        operador.setAsignado(false);
        empleados.add(operador);
        
        director = FabricaObjetos.crearDirector();
        director.setNombre("Andrea Juanpi");
        director.setAsignado(false);
        empleados.add(director);
        
        supervisor = FabricaObjetos.crearSupervisor();
        supervisor.setNombre("Ame Las");
        supervisor.setAsignado(false);
        empleados.add(supervisor);
        
        operador = FabricaObjetos.crearOperador();
        operador.setNombre("Elver Gomez");
        operador.setAsignado(false);
        empleados.add(operador);
        
        supervisor = FabricaObjetos.crearSupervisor();
        supervisor.setNombre("Aran Danos");
        supervisor.setAsignado(false);
        empleados.add(supervisor);
        
        director = FabricaObjetos.crearDirector();
        director.setNombre("Esteban quito");
        director.setAsignado(false);
        empleados.add(director);
        
        director = FabricaObjetos.crearDirector();
        director.setNombre("Popo San");
        director.setAsignado(false);
        empleados.add(director);
        
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
    public void testDispatchCall() {
//        LlamadaTelefonica llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        llamadaTelefonica.setIdLlamada("Llamada 1");
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Pepito Perez", llamadaTelefonica.getContestador().getNombre());
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Armando Casas", llamadaTelefonica.getContestador().getNombre());
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Elver Gomez", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Juan Pigna", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Ame Las", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Aran Danos", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Tropi cana", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Andrea Juanpi", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Esteban quito", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertEquals("Popo San", llamadaTelefonica.getContestador().getNombre());        
//        assertTrue(llamadaTelefonica.getContestador().getAsignado());
//        
//        // hasta aqui fue
//        llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
//        dispatcher.dispatchCall(empleados, llamadaTelefonica);
//        llamadaTelefonica.start();
//        assertTrue(llamadaTelefonica.getEnEspera());

    }
    
}
