package Herramientas_Banco;

public class transacciones extends clientes
{
    String numero_transaccion;
    int tipo_transaccion;
    String fecha_transaccion;
    String cuenta_destino_transaccion;
    Double monto_transaccion;
    Boolean estado_transaccion;
    Boolean interbancaria_transaccion;
    Boolean tipo_cuenta;
    int tipo_pago_transaccion;

    public transacciones() {}

    public transacciones(String nombre_cliente, String apellido_cliente, int edad_cliente, String id_cliente, String email_cliente, String nacionalidad_cliente, String numero_transaccion, int tipo_transaccion, String fecha_transaccion, Double monto_transaccion, String cuenta_destino_transaccion, Boolean estado_transaccion, Boolean interbancaria_transaccion, Boolean tipo_cuenta, int tipo_pago_transaccion)
    {
        super(nombre_cliente, apellido_cliente, edad_cliente, id_cliente, email_cliente, nacionalidad_cliente);
        this.numero_transaccion = numero_transaccion;
        this.tipo_transaccion = tipo_transaccion;
        this.fecha_transaccion = fecha_transaccion;
        this.monto_transaccion = monto_transaccion;
        this.cuenta_destino_transaccion = cuenta_destino_transaccion;
        this.estado_transaccion = estado_transaccion;
        this.interbancaria_transaccion = interbancaria_transaccion;
        this.tipo_cuenta = tipo_cuenta;
        this.tipo_pago_transaccion = tipo_pago_transaccion;
    }

    public String getNumero_transaccion() {
        return numero_transaccion;
    }

    public void setNumero_transaccion(String numero_transaccion) {
        this.numero_transaccion = numero_transaccion;
    }

    public int getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(int tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public String getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(String fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    public String getCuenta_destino_transaccion() {
        return cuenta_destino_transaccion;
    }

    public void setCuenta_destino_transaccion(String cuenta_destino_transaccion) {
        this.cuenta_destino_transaccion = cuenta_destino_transaccion;
    }

    public Double getMonto_transaccion() {
        return monto_transaccion;
    }

    public void setMonto_transaccion(Double monto_transaccion) {
        this.monto_transaccion = monto_transaccion;
    }

    public Boolean getEstado_transaccion() {
        return estado_transaccion;
    }

    public void setEstado_transaccion(Boolean estado_transaccion) {
        this.estado_transaccion = estado_transaccion;
    }

    public Boolean getInterbancaria_transaccion() {
        return interbancaria_transaccion;
    }

    public void setInterbancaria_transaccion(Boolean interbancaria_transaccion) {
        this.interbancaria_transaccion = interbancaria_transaccion;
    }

    public Boolean getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(Boolean tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public int getTipo_pago_transaccion() {
        return tipo_pago_transaccion;
    }

    public void setTipo_pago_transaccion(int tipo_pago_transaccion) {
        this.tipo_pago_transaccion = tipo_pago_transaccion;
    }
}
