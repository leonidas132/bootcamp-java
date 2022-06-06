package interfaces_base_dato;

import java.util.List;

public interface DAO <E,K> {
    public abstract boolean buscar(K k);

    public abstract boolean Insertar(E e);

    public abstract boolean modificar(E e);

    public abstract boolean Eliminar(E e);

    List<E> listar();

}
