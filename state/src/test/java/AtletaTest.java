import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AtletaTest {

    Atleta atleta;

    @BeforeEach
    public void setUp(){
        atleta = new Atleta();
    }

    //Atleta Contratado

    @Test
    public void naoDeveContratarAtletaContratado(){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertFalse(atleta.contratar());

    }

    @Test
    public void deveRepousarAtletaContratado(){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertTrue(atleta.repousar());
        assertEquals(AtletaEstadoRepousado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveRecuperarAtletaContratado(){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertTrue(atleta.recuperar());
        assertEquals(AtletaEstadoRecuperado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveCompetirAtletaContratado(){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertTrue(atleta.competir());
        assertEquals(AtletaEstadoCompetiu.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveAquecerAtletaContratado (){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertTrue(atleta.aquecer());
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarFisicoAtletaContratado (){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertTrue(atleta.treinarFisico());
        assertEquals(AtletaEstadoTreinadoFisico.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarTecnicoAtletaContratado(){
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        assertTrue(atleta.treinarTecnico());
        assertEquals(AtletaEstadoTreinadoTecnico.getInstance(), atleta.getEstado());
    }

    //Atleta Aquecido
    @Test
    public void naoDeveAquecerAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertFalse(atleta.aquecer());
    }

    @Test
    public void naoDeveRecuperarAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertFalse(atleta.recuperar());
    }

    @Test
    public void naoDeveRepousarAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertFalse(atleta.repousar());
    }


    @Test
    public void deveCompetirAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertTrue(atleta.competir());
        assertEquals(AtletaEstadoCompetiu.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveContratarAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertTrue(atleta.contratar());
        assertEquals(AtletaEstadoContratado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarFisicoAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertTrue(atleta.treinarFisico());
        assertEquals(AtletaEstadoTreinadoFisico.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarTecnicoAtletaAquecido(){
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        assertTrue(atleta.treinarTecnico());
        assertEquals(AtletaEstadoTreinadoTecnico.getInstance(), atleta.getEstado());
    }


    //Atleta Competiu
    @Test
    public void naoDeveCompetirAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertFalse(atleta.competir());
    }

    @Test
    public void naoDeveTreinarTecnicoAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertFalse(atleta.treinarTecnico());
    }

    @Test
    public void naoDeveTreinarFisicoAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertFalse(atleta.treinarFisico());
    }

    @Test
    public void naoDeveAquecerAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertFalse(atleta.aquecer());
    }

    @Test
    public void deveRepousarAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertTrue(atleta.repousar());
        assertEquals(AtletaEstadoRepousado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveRecuperarAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertTrue(atleta.recuperar());
        assertEquals(AtletaEstadoRecuperado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveContrarAtletaCompetiu(){
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertTrue(atleta.contratar());
        assertEquals(AtletaEstadoContratado.getInstance(), atleta.getEstado());
    }



    //Atleta Recuperado
    @Test
    public void naoDeveRecuperarAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertFalse(atleta.recuperar());
    }

    @Test
    public void deveContrarAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertTrue(atleta.contratar());
        assertEquals(AtletaEstadoContratado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarTecnicoAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertTrue(atleta.treinarTecnico());
        assertEquals(AtletaEstadoTreinadoTecnico.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarFisicoAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertTrue(atleta.treinarFisico());
        assertEquals(AtletaEstadoTreinadoFisico.getInstance(), atleta.getEstado());
    }


    @Test
    public void deveRepousarAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertTrue(atleta.repousar());
        assertEquals(AtletaEstadoRepousado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveCompetirAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertTrue(atleta.competir());
        assertEquals(AtletaEstadoCompetiu.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveAqueceAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRecuperado.getInstance());
        assertTrue(atleta.aquecer());
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());
    }



    //Atleta Repousado
    @Test
    public void naoDeveRepousarAtletaRepousado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertFalse(atleta.repousar());
    }

    @Test
    public void naoDeveRepousarAtletaRecuperado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertFalse(atleta.recuperar());
    }

    @Test
    public void deveTreinarFisicoAtletaRepousado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertTrue(atleta.treinarFisico());
        assertEquals(AtletaEstadoTreinadoFisico.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveTreinarTecnicoAtletaRepousado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertTrue(atleta.treinarTecnico());
        assertEquals(AtletaEstadoTreinadoTecnico.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveContratarAtletaRepousado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertTrue(atleta.contratar());
        assertEquals(AtletaEstadoContratado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveCompetirAtletaRepousado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertTrue(atleta.competir());
        assertEquals(AtletaEstadoCompetiu.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveAquecerAtletaRepousado(){
        atleta.setEstado(AtletaEstadoRepousado.getInstance());
        assertTrue(atleta.aquecer());
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());
    }


    //Atleta Treinado Fisico
    @Test
    public void naoDeveTreinarFisicoAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertFalse(atleta.treinarFisico());
    }

    @Test
    public void deveTreinarTecnicoAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertTrue(atleta.treinarTecnico());
        assertEquals(AtletaEstadoTreinadoTecnico.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveRepousarAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertTrue(atleta.repousar());
        assertEquals(AtletaEstadoRepousado.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveRecuperarAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertTrue(atleta.recuperar());
        assertEquals(AtletaEstadoRecuperado.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveContratarAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertTrue(atleta.contratar());
        assertEquals(AtletaEstadoContratado.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveCompetirAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertTrue(atleta.competir());
        assertEquals(AtletaEstadoCompetiu.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveAquecerAtletaTreinadoFisico(){
        atleta.setEstado(AtletaEstadoTreinadoFisico.getInstance());
        assertTrue(atleta.aquecer());
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());

    }


    //Atleta Treinado Tecnico
    @Test
    public void naoDeveTreinarTecnicoAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertFalse(atleta.treinarTecnico());
    }

    @Test
    public void deveTreinarFisicoAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertTrue(atleta.treinarFisico());
        assertEquals(AtletaEstadoTreinadoFisico.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveRepousarAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertTrue(atleta.repousar());
        assertEquals(AtletaEstadoRepousado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveRecuperarAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertTrue(atleta.recuperar());
        assertEquals(AtletaEstadoRecuperado.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveContratarAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertTrue(atleta.contratar());
        assertEquals(AtletaEstadoContratado.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveCompetirAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertTrue(atleta.competir());
        assertEquals(AtletaEstadoCompetiu.getInstance(), atleta.getEstado());

    }

    @Test
    public void deveAquecerAtletaTreinadoTecnico(){
        atleta.setEstado(AtletaEstadoTreinadoTecnico.getInstance());
        assertTrue(atleta.aquecer());
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());

    }




}
