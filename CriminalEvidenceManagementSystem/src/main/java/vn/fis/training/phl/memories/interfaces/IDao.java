package vn.fis.training.phl.memories.interfaces;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    // CREATE
    void save(T t);

    // READ | RETRIEVE
    Optional<T> get(long id); // đảm bảo giá trị trả về ko bao giờ null, nếu có thì lấy, nếu ko thì ko lấy . đảm bảo nullpointerexception
    List<T> getAll();

    // UPDATE
    void update(T t);

    // DELETE
    void delete(T t);
}