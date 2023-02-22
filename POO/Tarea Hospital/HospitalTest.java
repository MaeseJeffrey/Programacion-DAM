public class HospitalTest {
    public static void main(String[] args) {
        Trabajador T1= new Trabajador("Jeffrey", "443322", 1910.42);
        Medico M1= new Medico("Alejandro", "223344", 20, EspMedico.CARIDIOLOGO, 12345, 54321);
        NoMedico NM1=new NoMedico("Juanan", "123456789", 999999, EspNoMedico.ENFERMEROS, "Cuarto de baño");
        System.out.println(T1.getNombre());
        System.out.println(M1.getNumPacientes());
        System.out.println(NM1.getSueldo());
    }
}
