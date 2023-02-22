public class Trabajador {
    private String nombre;
    private String iD;
    private double sueldo;
    Trabajador(){}
    Trabajador(String nombre, String iD, double sueldo){
        this.nombre=nombre;
        this.iD=iD;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getiD() {
        return iD;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
