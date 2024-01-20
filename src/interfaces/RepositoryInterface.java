package interfaces;
import java.util.List;

/**
 * RepositoryInterface
 */
public interface RepositoryInterface<T> {
    
    public T recuperarId(Long id);
    List<T> recuperarTodos();
    void agregar(T entidad);
    void modificar(T entidad);
    void eliminar(T entidad);

}
