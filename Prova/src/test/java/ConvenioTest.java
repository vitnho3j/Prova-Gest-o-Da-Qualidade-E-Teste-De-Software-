import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ConvenioTest {
    @Test
    void deveRetornarNomeConvenio() {
        Convenio convenio = createMock(Convenio.class);
        expect(convenio.getNome()).andReturn("Convênio1");
        replay(convenio);
        assertEquals("Convênio1", convenio.getNome());
    }

    @Test
    void deveRetornarNomeConvenioNuloConstrutor() {
        try {
            Convenio convenio = createMock(Convenio.class);
            expect(convenio.getNome()).andReturn(null);
            replay(convenio);
        } catch (NullPointerException e) {
            assertEquals("Descrição é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeConvenioSet() {
        Convenio convenio = new Convenio("Convênio1");
        convenio.setNome("Convênio2");
        assertEquals("Convênio2", convenio.getNome());
    }

    @Test
    void deveRetornarExcessaoNomeConvenioSet() {
        try {
            Convenio convenio = new Convenio("Convênio1");
            convenio.setNome(null);
        } catch (NullPointerException e) {
            assertEquals("Descrição é obrigatória", e.getMessage());
        }
    }
}
