public class Persona {
    protected String nombre;
    protected String apellido;
    protected String dNI;
    protected String mail;

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getdNI() {
        return dNI;
    }
    public String getMail() {
        return mail;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setdNI(String dNI) {
        this.dNI = dNI;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    Persona(){

    }
    Persona(String nombre, String apellido, String dNI, String mail){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dNI=dNI;
        this.mail=mail;
    }
}
