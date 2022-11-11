package Modelo;

public class Usuario {

    private String id;
    private String identificacion;
    private String nombre;
    private Integer edad;

    public Usuario() {
    }

    public Usuario(String id, String identificacion, String nombre, Integer edad) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
