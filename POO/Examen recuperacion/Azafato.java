public class Azafato extends Persona {
    protected double saldo;
    protected Idiomas idiomas[];

    public double getSaldo() {
        return saldo;
    }
    public Idiomas[] getIdiomas() {
        return idiomas;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setIdiomas(Idiomas[] idiomas) {
        this.idiomas = idiomas;
    }

    Azafato(){

    }
    Azafato(String nombre, String apellido, String dNI, String mail, double saldo, Idiomas idiomas[]){
        super(nombre, apellido, dNI, mail);
        this.saldo=saldo;
        this.idiomas=idiomas;
    }
}
