package vallegrtande.edu.pe.Model;

public class Usuario {
    private String nombre;

    public Usuario() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean nombreValido() {
        return nombre != null && !nombre.trim().isEmpty();
    }
}

