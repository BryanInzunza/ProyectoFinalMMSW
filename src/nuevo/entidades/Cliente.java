package nuevo.entidades;

import java.util.UUID;

public record Cliente(UUID id, String nombre, String direccion) {
    public Cliente(String nombre, String direccion) {
        this(UUID.randomUUID(), nombre, direccion);
    }
}
