package tineo.models;

public class OdontologoModel {
    private Integer odontologoID;
    private final String numeroMatricula;
    private final String nombre;
    private final String apellido;

    public OdontologoModel(Integer odontologoID, String numeroMatricula, String nombre, String apellido) {
        this.odontologoID = odontologoID;
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public OdontologoModel(String numeroMatricula, String nombre, String apellido) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo[" +
                "odontologoID=" + odontologoID +
                ", numeroMatricula='" + numeroMatricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ']';
    }

    public void setOdontologoID(Integer odontologoID) {
        this.odontologoID = odontologoID;
    }

    public Integer getOdontologoID() {
        return odontologoID;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
