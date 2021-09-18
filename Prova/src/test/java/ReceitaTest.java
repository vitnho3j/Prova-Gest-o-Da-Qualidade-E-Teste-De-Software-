import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ReceitaTest {

    @Test
    void deveRetornarNumeroRemediosZerado(){
        Receita receita = new Receita();

        assertEquals(0, receita.getNumeroRemedio());
    }

    @Test
    void deveCadastrarRemedios(){
        Receita receita = new Receita();
        Remedio remedio = new Remedio();
        receita.adicionarRemedio(remedio);

        assertEquals(1, receita.getNumeroRemedio());
    }

    @Test
    void deveCadastrarRemediosMock(){
        Receita receita = createMock(Receita.class);
        expect(receita.getNumeroRemedio()).andReturn(1);
        replay(receita);
        assertEquals(1, receita.getNumeroRemedio());
    }

    @Test
    void deveRetornarExcessaoAdicionarRemedioNula(){
        try {
            Receita receita = new Receita();
            receita.adicionarRemedio(null);
            fail();
       }
        catch (NullPointerException e){
            assertEquals("Remédio é obrigatório!", e.getMessage());
        }
    }

    @Test
    void deveCadastrarDoisRemedios(){
        Receita receita = new Receita();
        Remedio remedio1 = new Remedio();
        Remedio remedio2 = new Remedio();
        receita.adicionarRemedio(remedio1);
        receita.adicionarRemedio(remedio2);

        assertEquals(2, receita.getNumeroRemedio());
    }

    @Test
    void deveEncontrarRemedio(){
        Receita receita = new Receita();
        Remedio remedio = new Remedio();
        receita.adicionarRemedio(remedio);

        assertTrue(receita.verificaRemedio(remedio));
    }

    @Test
    void deveRetornarExcessaoEncontrarRemedioNula(){
        try{
            Receita receita = new Receita();
            receita.verificaRemedio(null);
        }
        catch (NullPointerException e){
            assertEquals("Remédio é obrigatório!", e.getMessage());
        }

    }

    @Test
    void naodeveEncontrarRemedio(){
        Receita receita = new Receita();
        Remedio remedio = new Remedio();

        assertFalse(receita.verificaRemedio(remedio));
    }

    @Test
    void deveEncontrarRemedioPeloNome() {
        Receita receita = new Receita();
        Remedio remedio = new Remedio();
        remedio.setNome("Rivotril");
        receita.adicionarRemedio(remedio);

        assertTrue(receita.verificaRemedioPorNome("Rivotril"));
    }

    @Test
    void naoDeveEncontrarRemedioPeloNome(){
        Receita receita = new Receita();

        assertFalse(receita.verificaRemedioPorNome("Rivotril"));

    }

}