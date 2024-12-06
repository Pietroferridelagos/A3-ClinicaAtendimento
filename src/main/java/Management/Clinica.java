package Management;

import Objects.Medico;
import Objects.Paciente;

public class Clinica {

    public void AdicioanarMedicoEmPaciente(Medico m, Paciente p){
        m.addPaciente(p);
        p.setMedico(m);
    }
}
