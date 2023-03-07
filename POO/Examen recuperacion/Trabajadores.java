import java.util.concurrent.ScheduledExecutorService;

public class Trabajadores extends Persona{
    protected double sueldo;

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    Trabajadores(){

    }
    Trabajadores(String nombre, String apellido, String dNI, String mail, double sueldo){
        super(nombre, apellido, dNI, mail);
        this.sueldo=sueldo;
    }
}
