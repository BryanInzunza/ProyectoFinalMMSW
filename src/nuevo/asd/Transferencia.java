package nuevo.asd;

import nuevo.CajeroAutomatico;
import nuevo.entidades.Transaccion;

public class Transferencia implements Movimiento {
    @Override
    public void transaccion(CajeroAutomatico cajero) {
        System.out.println("=== Transferencia ===");
        System.out.println("Ingrese el numero de cuenta a la que desea transferir: ");
        String numeroCuenta = in.next();
        var cuentaMaybe = cajero.getCuentas().stream().filter(x -> x.getNumeroDeCuenta().equals(numeroCuenta)).findAny();
        if (cuentaMaybe.isEmpty()) {
            System.out.println("No se encontro la cuenta");
            return;
        }
        var cuenta = cuentaMaybe.get();
        System.out.println("Ingrese la cantidad a transferir: ");
        double cantidad = in.nextDouble();
        if (cantidad > cajero.getCuentaActual().getSaldo()) {
            System.out.println("No tiene suficiente saldo");
            return;
        }
        if (cantidad < 0) {
            System.out.println("No puede transferir cantidades negativas");
            return;
        }
        cajero.getCuentaActual().setSaldo(cajero.getCuentaActual().getSaldo() - cantidad);
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        cajero.getTransacciones().add(new Transaccion("Transferencia", cantidad, cuenta, cajero.getBanco().nombre()));
        System.out.println("=== Fin de transferencia ===");
    }
}