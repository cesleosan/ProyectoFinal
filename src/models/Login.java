package models;

public class Login {
    private Long id;
    private String nombre;
    private String email;
    private String usuario;
    private String contrasenia;

    public Login(Long id, String nombre, String email, String usuario, String contrasenia)
    {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.contrasenia = contrasenia;

    }

    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getUsuario() {
        return usuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
