package nuevo.entidades;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public record Transaccion(UUID id, LocalDate fecha, String tipo, Double monto, Optional<Cuenta> destino, String banco) {
    public Transaccion(String tipo, Double monto, Cuenta destino, String banco) {
        this(UUID.randomUUID(), LocalDate.now(), tipo, monto, Optional.of(destino), banco);
    }

    public Transaccion(String tipo, Double monto, String banco) {
        this(UUID.randomUUID(), LocalDate.now(), tipo, monto, Optional.empty(), banco);
    }
}
