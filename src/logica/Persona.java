
package logica;


public class Persona {
    private String documento;
    private String nombre;
    private String email;
    private int celular;
    private int edad;

    public Persona(String documento, String nombre, String email, int celular, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
}
