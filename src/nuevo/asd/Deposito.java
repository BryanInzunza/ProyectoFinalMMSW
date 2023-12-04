package nuevo.asd;

import nuevo.CajeroAutomatico;
import nuevo.entidades.Transaccion;

public class Deposito implements Movimiento {
    @Override
    public void transaccion(CajeroAutomatico cajero) {
        System.out.println("=== DEPOSITO ===");
        System.out.println("Ingrese la cantidad a depositar: ");
        var cantidad = in.nextDouble();
        if (cantidad > 0) {
            var saldoActual = cajero.getCuentaActual().getSaldo();
            cajero.getCuentaActual().setSaldo(saldoActual + cantidad);
            cajero.getTransacciones().add(new Transaccion("Deposito", cantidad, cajero.getBanco().nombre()));
        } else {
            System.out.println("No se puede depositar esa cantidad");
        }
        System.out.println("=== FIN DEPOSITO ===");
    }
}