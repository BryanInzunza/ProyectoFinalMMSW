package nuevo.entidades;

import java.time.LocalDate; // es para la fecha
import java.util.Optional;  // es para un optional(si o no), para evitar usar nulos
import java.util.UUID;      // es para identificador unico

public record Transaccion(UUID id, LocalDate fecha, String tipo, Double monto, Optional<Cuenta> destino, String banco) {
    public Transaccion(String tipo, Double monto, Cuenta destino, String banco) {
        this(UUID.randomUUID(), LocalDate.now(), tipo, monto, Optional.of(destino), banco); // hace referencia a clase superior con el this
    }

    public Transaccion(String tipo, Double monto, String banco) {
        this(UUID.randomUUID(), LocalDate.now(), tipo, monto, Optional.empty(), banco);
    }
}
