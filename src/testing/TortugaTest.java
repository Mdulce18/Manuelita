package testing;

import clases.Misiones;
import clases.Paris;
import clases.Pehuajo;
import clases.Tortuga;
import junit.framework.TestCase;

public class TortugaTest extends TestCase {

    private Tortuga manuelita = new Tortuga();
    private Misiones misiones = new Misiones();
    private Paris paris = new Paris();
    private Pehuajo pehuajo = new Pehuajo();

    public void setUp(){
        manuelita.setEnergia(100);
    }

    public void testManuelitaCaminar(){
        manuelita.caminar(50);
        assertTrue(manuelita.getEnergia()==75);
    }

    public void testManuelitaComer(){
        manuelita.comer(300);
        assertTrue(manuelita.getEnergia()==700);
    }

    public void testManuelitaIrMisiones(){
        manuelita.setLugar(misiones);
        assertTrue(manuelita.vacacionar()==130);
    }

    public void testManuelitaIrParis(){
        manuelita.setLugar(paris);
        assertTrue(manuelita.vacacionar()==180);
    }

    public void testManuelitaIrPehuajo(){
        manuelita.setLugar(pehuajo);
        assertTrue(manuelita.vacacionar()==100);
    }

}