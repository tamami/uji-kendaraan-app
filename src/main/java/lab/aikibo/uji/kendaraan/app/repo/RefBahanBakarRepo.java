package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.RefBahanBakar;
import org.springframework.data.repository.CrudRepository;

public interface RefBahanBakarRepo extends CrudRepository<RefBahanBakar, Integer> {
    
    List<RefBahanBakar> findAll();
    List<RefBahanBakar> findAllByOrderById();
    
}
