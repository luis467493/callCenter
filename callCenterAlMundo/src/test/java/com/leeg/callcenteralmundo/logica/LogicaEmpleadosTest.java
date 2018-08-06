package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Director;
import com.leeg.callcenteralmundo.modelo.Empleados;
import com.leeg.callcenteralmundo.modelo.Operador;
import com.leeg.callcenteralmundo.modelo.Supervisor;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LogicaEmpleadosTest {
    
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
    public void testEncontrarSiguienteOperador() {
        Empleados.llenarEmpleados();
        LogicaEmpleados<Operador> logicaGeneral = new LogicaEmpleados<>();
        Operador operadorEncontrado = logicaGeneral.encontrarSiguienteEmpleadoDisponible( new Operador() );
        assertEquals("Pepito Perez", operadorEncontrado.getNombre());
    }

    @Test
    public void testEncontrarSiguienteSupervisor() {
        Empleados.llenarEmpleados();
        LogicaEmpleados<Supervisor> logicaGeneral = new LogicaEmpleados<>();
        Supervisor supervisorEncontrado = logicaGeneral.encontrarSiguienteEmpleadoDisponible( new Supervisor() );
        assertEquals("Juan Pigna", supervisorEncontrado.getNombre());
    }

    @Test
    public void testEncontrarSiguienteDirector() {
        Empleados.llenarEmpleados();
        LogicaEmpleados<Director> logicaGeneral = new LogicaEmpleados<>();
        Director directorEncontrado = logicaGeneral.encontrarSiguienteEmpleadoDisponible( new Director() );
        assertEquals("Tropi cana", directorEncontrado.getNombre());
    }
    
}
