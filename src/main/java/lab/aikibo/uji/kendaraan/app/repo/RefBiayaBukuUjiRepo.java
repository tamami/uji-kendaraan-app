package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.RefBiayaBukuUji;
import org.springframework.data.repository.CrudRepository;

public interface RefBiayaBukuUjiRepo extends CrudRepository<RefBiayaBukuUji, Integer> {
    
    List<RefBiayaBukuUji> findAll();
    List<RefBiayaBukuUji> findById(Integer id);
    
}
