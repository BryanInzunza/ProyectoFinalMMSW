package nuevo.entidades;

public class Cuenta {
    private String numeroDeCuenta;
    private Cliente cliente;
    private String tipo;
    private Double saldo;
    private String banco;
    private TarjetaDeDebito tarjetaDeDebito;

    public Cuenta(String numeroDeCuenta, Cliente cliente, String tipo, Double saldo, String banco, TarjetaDeDebito tarjetaDeDebito) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.tipo = tipo;
        this.saldo = saldo;
        this.banco = banco;
        this.tarjetaDeDebito = tarjetaDeDebito;
    }

    @Override
    public String toString() {
        return "Cuenta[" +
                "numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", cliente='" + cliente + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                ", banco='" + banco + '\'' +
                ", tarjetaDeDebito=" + tarjetaDeDebito +
                ']';
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public TarjetaDeDebito getTarjetaDeDebito() {
        return tarjetaDeDebito;
    }

    public void setTarjetaDeDebito(TarjetaDeDebito tarjetaDeDebito) {
        this.tarjetaDeDebito = tarjetaDeDebito;
    }
}