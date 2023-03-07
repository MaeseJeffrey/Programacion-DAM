public class Viajes extends Piloto{
    protected double duracion;
    protected String ciudadOrigen;
    protected String ciudadDestino;
    protected int numeroPasajeros;

    public double getDuracion() {
        return duracion;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    Viajes(){

    }
    Viajes(String nombre, String apellido, String dNI, String mail, double sueldo, Rango rango, boolean vueloInternacional, double duracion, String ciudadOrigen, String ciudadDestino, int numeroPasajeros){
        super(nombre, apellido, dNI, mail, sueldo, rango, vueloInternacional);
        this.duracion=duracion;
        this.ciudadOrigen=ciudadOrigen;
        this.ciudadDestino=ciudadDestino;
        this.numeroPasajeros=numeroPasajeros;
    }
}
