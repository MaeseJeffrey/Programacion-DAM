public class Piloto extends Persona{
    protected double sueldo;
    protected Rango rango;
    protected boolean vueloInternacional;

    public double getSueldo() {
        return sueldo;
    }
    public Rango getRango() {
        return rango;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setRango(Rango rango) {
        this.rango = rango;
    }

    Piloto(){

    }
    Piloto(String nombre, String apellido, String dNI, String mail, double sueldo, Rango rango, boolean vueloInternacional){
        super(nombre, apellido, dNI, mail);
        this.sueldo=sueldo;
        this.rango=rango;
        this.vueloInternacional=vueloInternacional;
    }
}