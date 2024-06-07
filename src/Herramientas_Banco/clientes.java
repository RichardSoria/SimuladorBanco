package Herramientas_Banco;

public class clientes
{
    String nombre_cliente;
    String apellido_cliente;
    int edad_cliente;
    String id_cliente;
    String nacionalidad_cliente;
    String email_cliente;

    public clientes() {}

    public clientes(String nombre_cliente, String apellido_cliente, int edad_cliente, String id_cliente, String email_cliente, String nacionalidad_cliente)
    {
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.edad_cliente = edad_cliente;
        this.id_cliente = id_cliente;
        this.email_cliente = email_cliente;
        this.nacionalidad_cliente = nacionalidad_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getEdad_cliente() {
        return edad_cliente;
    }

    public void setEdad_cliente(int edad_cliente) {
        this.edad_cliente = edad_cliente;
    }

    public String getNacionalidad_cliente() {
        return nacionalidad_cliente;
    }

    public void setNacionalidad_cliente(String nacionalidad_cliente) {
        this.nacionalidad_cliente = nacionalidad_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
}
