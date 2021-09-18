import org.easymock.cglib.core.Converter;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarConvenioSet(){
        Convenio convenio = new Convenio("Central Nacional Unimed (CNU)");
        Paciente paciente = new Paciente();
        paciente.setConvenio(convenio);
        assertEquals("Central Nacional Unimed (CNU)", paciente.getNomeConvenio());
    }

    @Test
    void deveRetornarExcessaoConvenioNuloSet(){
        try{
            Paciente paciente = new Paciente();
            paciente.setConvenio(null);
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Convênio é obrigatório!", e.getMessage());
        }
    }
    @Test
    void deveRetornarConvenioSetMock(){
        Convenio convenio = createMock(Convenio.class);
        expect(convenio.getNome()).andReturn("Central Nacional Unimed (CNU)");
        replay(convenio);
        Paciente paciente = new Paciente();
        paciente.setConvenio(convenio);
        assertEquals("Central Nacional Unimed (CNU)", paciente.getNomeConvenio());
    }
    @Test
    void deveRetornarNomeMedico(){
        Consulta consulta = createMock(Consulta.class);
        expect(consulta.getMedico()).andReturn("Roberto");
        replay(consulta);
        Paciente paciente = new Paciente();
        paciente.setConsulta(consulta);
        assertEquals("Roberto", paciente.pegaNomeMedicoDeConsulta());
    }
}