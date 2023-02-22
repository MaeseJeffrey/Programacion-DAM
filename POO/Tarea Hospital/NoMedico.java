public class NoMedico extends Trabajador {
    private EspNoMedico Especialidad;
    private String AreaTrabajo;
    
    NoMedico(){}
    NoMedico(String nombre, String iD, double sueldo, EspNoMedico Especialidad, String AreaTrabajo){
        super(nombre, iD, sueldo);
        this.Especialidad=Especialidad;
        this.AreaTrabajo=AreaTrabajo;
    }

    public EspNoMedico getEspecialidad() {
        return Especialidad;
    }
    public String getAreaTrabajo() {
        return AreaTrabajo;
    }
    public void setEspecialidad(EspNoMedico especialidad) {
        Especialidad = especialidad;
    }
    public void setAreaTrabajo(String areaTrabajo) {
        AreaTrabajo = areaTrabajo;
    }
}
