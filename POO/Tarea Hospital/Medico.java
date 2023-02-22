public class Medico extends Trabajador{
    private EspMedico Especialidad;
    private int NumColegiado;
    private int NumPacientes;

    Medico(){}
    Medico(String nombre, String iD, double sueldo, EspMedico Especialidad, int NumColegiado, int NumPacientes){
            super(nombre, iD, sueldo);
            this.Especialidad=Especialidad;
            this.NumColegiado=NumColegiado;
            this.NumPacientes=NumPacientes;
    }
    
    public EspMedico getEspecialidad() {
        return Especialidad;
    }
    public int getNumColegiado() {
        return NumColegiado;
    }
    public int getNumPacientes() {
        return NumPacientes;
    }
    public void setEspecialidad(EspMedico especialidad) {
        Especialidad = especialidad;
    }
    public void setNumColegiado(int numColegiado) {
        NumColegiado = numColegiado;
    }
    public void setNumPacientes(int numPacientes) {
        NumPacientes = numPacientes;
    }
    
}
