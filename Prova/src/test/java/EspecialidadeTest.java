import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class EspecialidadeTest {

    @Test
    void deveRetornarNomeEspecialidade(){
        Especialidade especialidade = new Especialidade("Cardiologista");
        assertEquals("Cardiologista", especialidade.getNome());
    }
    @Test
    void deveRetornarNomeEspecialidadeMock(){
        Especialidade especialidade = createMock(Especialidade.class);
        expect(especialidade.getNome()).andReturn("Cardiologista");
        replay(especialidade);
        assertEquals("Cardiologista", especialidade.getNome());
    }

    @Test
    void deveRertornarExcessaoNomeEspecialidadeNulaContrutor(){
        try {
            Especialidade especialidade = new Especialidade(null);
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Nome é obrigatório!", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeEspecialidadeSet(){
        Especialidade especialidade = new Especialidade("Cardiologista");
        especialidade.setNome("Oftamologista");
        assertEquals("Oftamologista", especialidade.getNome());
    }

    @Test
    void deveRetornarExcessaoNomeEspecialidadeNuloSet(){
        try {
            Especialidade especialidade = new Especialidade("Cardiologista");
            especialidade.setNome(null);
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Nome é obrigatório!", e.getMessage());
        }
    }
}