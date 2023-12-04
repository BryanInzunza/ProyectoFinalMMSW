package nuevo;

import nuevo.asd.*;
import nuevo.entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CajeroAutomatico {
    private List<Transaccion> transacciones;
    private List<Cuenta> cuentas;
    private Cuenta cuentaActual;
    private Banco banco;
    private Scanner in;
    private LocalDate fecha;

    public CajeroAutomatico(Cuenta cuenta, Banco banco) {
        this.transacciones = new ArrayList<>();
        this.cuentas = List.of(
                new Cuenta("393843", new Cliente("Max", "PEMEX"), "Cuenta de Ahorro", 343.0, "BBVA", new TarjetaDeDebito("1234")),
                new Cuenta("93849", new Cliente("Kappa", "Camino Real"), "Cuenta de Cheques", 3123.3213, "Santaner", new TarjetaDeDebito("4321")),
                new Cuenta("09320132", new Cliente("Bryan", "Barrancos"), "Cuenta de Ahorro", 123.0, "Banamex", new TarjetaDeDebito("1111"))
        );
        this.cuentaActual = cuenta;
        this.banco = banco;
        this.in = new Scanner(System.in);
        this.fecha = LocalDate.now();
    }

    public void menu() {
        Movimiento movimiento;
        int seleccion;

        do {
            System.out.println("===================================");
            System.out.println("Transacciones hasta el dia de hoy: ");
            transacciones.forEach(System.out::println);
            System.out.println("===================================");

            System.out.println(" Buenas tardes esta en un cajero automatico de " + getBanco());
            System.out.println(" Hoy es " + fecha);
            System.out.println(" Porfavor seleccione una opción:");
            System.out.println("    1. Consulta de saldo.");
            System.out.println("    2. Retiro de efectivo.");
            System.out.println("    3. Deposito de efectivo.");
            System.out.println("    4. Hacer una transferencia");
            System.out.println("    5. Salir.");

            seleccion = in.nextInt();
            switch (seleccion) {
                case 1:
                    movimiento = new Consulta();
                    movimiento.transaccion(this);
                    break;
                case 2:
                    movimiento = new Retiro();
                    movimiento.transaccion(this);
                    break;
                case 3:
                    movimiento = new Deposito();
                    movimiento.transaccion(this);
                    break;
                case 4:
                    movimiento = new Transferencia();
                    movimiento.transaccion(this);
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            System.out.println("Presione ENTER para continuar...");
            in.nextLine();
            in.nextLine();
        } while (seleccion != 5);
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta getCuentaActual() {
        return cuentaActual;
    }

    public void setCuentaActual(Cuenta cuentaActual) {
        this.cuentaActual = cuentaActual;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}