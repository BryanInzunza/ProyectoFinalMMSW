package nuevo.asd;

import nuevo.CajeroAutomatico;

import java.util.Scanner;

public interface Movimiento {
    Scanner in = new Scanner(System.in);

    void transaccion(CajeroAutomatico cajero);
}