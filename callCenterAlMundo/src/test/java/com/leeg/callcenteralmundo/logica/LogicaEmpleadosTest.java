package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Director;
import com.leeg.callcenteralmundo.modelo.Empleado;
import com.leeg.callcenteralmundo.modelo.Operador;
import com.leeg.callcenteralmundo.modelo.Supervisor;
import java.util.ArrayList;
import java.util.List;
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
    
    private final List<Empleado> empleados = new ArrayList<>();
    
    public LogicaEmpleadosTest() {

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
    public void testEncontrarSiguienteOperador() {
        LogicaEmpleados<Operador> logicaGeneral = new LogicaEmpleados<>();
        Operador operadorEncontrado = logicaGeneral.encontrarSiguienteEmpleadoDisponible(FabricaObjetos.crearOperador() );
        assertEquals("Pepito Perez", operadorEncontrado.getNombre());
    }

    @Test
    public void testEncontrarSiguienteSupervisor() {
        LogicaEmpleados<Supervisor> logicaGeneral = new LogicaEmpleados<>();
        Supervisor supervisorEncontrado = logicaGeneral.encontrarSiguienteEmpleadoDisponible(FabricaObjetos.crearSupervisor() );
        assertEquals("Juan Pigna", supervisorEncontrado.getNombre());
    }

    @Test
    public void testEncontrarSiguienteDirector() {
        LogicaEmpleados<Director> logicaGeneral = new LogicaEmpleados<>();
        Director directorEncontrado = logicaGeneral.encontrarSiguienteEmpleadoDisponible(FabricaObjetos.crearDirector() );
        assertEquals("Tropi cana", directorEncontrado.getNombre());
    }
    
}
