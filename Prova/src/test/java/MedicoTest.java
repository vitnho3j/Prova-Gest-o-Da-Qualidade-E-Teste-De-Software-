import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveRetornarEspecialidadeMedico(){
        Especialidade especialidade = new Especialidade("Cardiologista");
        Medico medico = new Medico(especialidade);
        assertEquals("Cardiologista", medico.getEspecialidade());
    }

    @Test
    void deveRetornarConstrutorNulo(){
        try{
            Medico medico = new Medico(null);
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Especialidade é obrigatória!", e.getMessage());
        }
    }
    @Test
    void deveRetornarEspecialidadeMedicoSet(){
        Especialidade especialidade = new Especialidade("Cardiologista");
        Medico medico = new Medico(especialidade);
        medico.setEspecialidade("Oftamologista");
        assertEquals("Oftamologista", medico.getEspecialidade());
    }

    @Test
    void deveRetornarNuloSet(){
        try{
            Especialidade especialidade = new Especialidade("Cardiologista");
            Medico medico = new Medico(especialidade);
            medico.setEspecialidade(null);
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Especialidade é obrigatória!", e.getMessage());
        }
    }
    @Test
    void deveRetornarEspecialidadeMedicoMock(){
        Especialidade especialidade = createMock(Especialidade.class);
        expect(especialidade.getNome()).andReturn("Cardiologista");
        replay(especialidade);
        Medico medico = new Medico(especialidade);
        assertEquals("Cardiologista", medico.getEspecialidade());
    }

}