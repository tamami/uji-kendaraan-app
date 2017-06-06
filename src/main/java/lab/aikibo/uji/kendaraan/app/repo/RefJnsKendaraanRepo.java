package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.RefJnsKendaraan;
import org.springframework.data.repository.CrudRepository;

public interface RefJnsKendaraanRepo extends CrudRepository<RefJnsKendaraan, Integer> {
    
    List<RefJnsKendaraan> findAll();
    List<RefJnsKendaraan> findById(int id);
    List<RefJnsKendaraan> findAllByOrderByIdAsc();
    RefJnsKendaraan findOneById(int id);
    
}
