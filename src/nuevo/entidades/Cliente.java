package nuevo.entidades;

import java.util.UUID;//UUID es para una id(identificador unico)
//record es una clase que ya tiene incluido los getters, toString y el constructor de los atributos
public record Cliente(UUID id, String nombre, String direccion) {
    public Cliente(String nombre, String direccion) {
        this(UUID.randomUUID(), nombre, direccion);
    }
}
