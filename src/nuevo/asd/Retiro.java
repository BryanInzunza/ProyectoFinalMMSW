package nuevo.asd;

import nuevo.CajeroAutomatico;
import nuevo.entidades.Transaccion;

public class Retiro implements Movimiento {
    @Override
    public void transaccion(CajeroAutomatico cajero) {
        System.out.println("=== Retiro ===");
        System.out.print("Cuanto deseas retirar: ");
        double retiro = in.nextDouble();
        var saldo = cajero.getCuentaActual().getSaldo();
        if (retiro <= saldo) {
            cajero.getCuentaActual().setSaldo(saldo - retiro);
            cajero.getTransacciones().add(new Transaccion("Retiro", retiro, cajero.getBanco().nombre()));
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("=== Fin Retiro ===");
    }
}