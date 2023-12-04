package nuevo.asd;

import nuevo.CajeroAutomatico;

public class Consulta implements Movimiento {
    @Override
    public void transaccion(CajeroAutomatico cajero) {
        System.out.println("=== CONSULTA ===");
        System.out.println("Saldo: " + cajero.getCuentaActual().getSaldo());
        System.out.println("=== FIN CONSULTA ===");
    }
}