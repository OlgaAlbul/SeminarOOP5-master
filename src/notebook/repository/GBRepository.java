package notebook.repository;

import notebook.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий, для выполнения CreateReadUpdateDelete (CRUD) операций
 * @param <E> тип модели данных
 * @param <I> тип ID модели данных E
 */
public interface GBRepository<E, I> {
    List<E> findAll();
    E create(E e);
    Optional<E> findById(List<User> users, I id);
    Optional<E> update(I id, E e);
    void deleteUser(I userId);
    interface Operation<T> {
        List<T> readAll();
        void saveAll(List<T> data);
    }
}
