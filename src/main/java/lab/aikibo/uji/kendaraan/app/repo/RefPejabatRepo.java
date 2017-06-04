package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.RefPejabat;
import org.springframework.data.repository.CrudRepository;

public interface RefPejabatRepo extends CrudRepository<RefPejabat, String> {
    
    List<RefPejabat> findAll();
    List<RefPejabat> findByNama(String nama);
    List<RefPejabat> findByNip(String nip);
    
}
