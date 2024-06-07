package Herramientas_Banco;

public class cuentas extends clientes
{
    String numero_cuenta;
    String usuario_cuenta;
    String contrasenia_cuenta;
    String tipo_cuenta;
    Boolean estado_cuenta;
    Double saldo_cuenta;

    public cuentas() {}

    public cuentas(String nombre_cliente, String apellido_cliente, int edad_cliente, String id_cliente, String email_cliente, String nacionalidad_cliente, String numero_cuenta, String usuario_cuenta, String contrasenia_cuenta, Boolean estado_cuenta, String tipo_cuenta, Double saldo_cuenta)
    {
        super(nombre_cliente, apellido_cliente, edad_cliente, id_cliente, email_cliente, nacionalidad_cliente);
        this.numero_cuenta = numero_cuenta;
        this.usuario_cuenta = usuario_cuenta;
        this.contrasenia_cuenta = contrasenia_cuenta;
        this.estado_cuenta = estado_cuenta;
        this.tipo_cuenta = tipo_cuenta;
        this.saldo_cuenta = saldo_cuenta;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getUsuario_cuenta() {
        return usuario_cuenta;
    }

    public void setUsuario_cuenta(String usuario_cuenta) {
        this.usuario_cuenta = usuario_cuenta;
    }

    public String getContrasenia_cuenta() {
        return contrasenia_cuenta;
    }

    public void setContrasenia_cuenta(String contrasenia_cuenta) {
        this.contrasenia_cuenta = contrasenia_cuenta;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public Boolean getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(Boolean estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    public Double getSaldo_cuenta() {
        return saldo_cuenta;
    }

    public void setSaldo_cuenta(Double saldo_cuenta) {
        this.saldo_cuenta = saldo_cuenta;
    }
}
