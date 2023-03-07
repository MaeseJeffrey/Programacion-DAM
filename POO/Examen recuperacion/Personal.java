public class Personal extends Persona{
    protected double sueldo;

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    Personal(){

    }
    
    Personal(double sueldo){
        this.sueldo=sueldo;
    }
}
