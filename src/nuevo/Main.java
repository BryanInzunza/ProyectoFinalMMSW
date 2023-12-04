package nuevo;

import nuevo.entidades.Banco;
import nuevo.entidades.Cliente;
import nuevo.entidades.Cuenta;
import nuevo.entidades.TarjetaDeDebito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:	(Catalina)");
        String Nombre = in.nextLine();
        System.out.println("Ingrese su Numero de cuenta:	(23140972)");
        String Num_cuenta = in.nextLine();
        System.out.println("Ingrese su Nip: (8002)");
        int Nip = in.nextInt();
        System.out.println("----------------------------------------------------");
        if (Nombre.equals("Catalina") && Num_cuenta.equals("23140972") && Nip == 8002) {
            System.out.println("===============================================");
            System.out.print(Nombre);
            System.out.println("Que banco es: ");
            String banco_ = in.nextLine();
            System.out.println("===============================================");

            var banco = new Banco("BBVA", "Culiacan");
            var cuenta = new Cuenta(Num_cuenta, new Cliente(Nombre, "Angostura"), "Cuenta de Ahorro", 0.0, banco_, new TarjetaDeDebito("3333"));
            if (banco_.equals(banco.nombre())) {
                var cajero = new CajeroAutomatico(cuenta, banco);
                cajero.menu();
            } else {
                System.out.println("===============================================");
                System.out.println("Alguno de sus datos es erroneo, intente denuevo");
                System.out.println("===============================================");
            }
        } else {
            System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
            System.out.println("===============================================");
        }
    }
}