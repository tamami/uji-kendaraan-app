package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.RefBahanKaroseri;
import org.springframework.data.repository.CrudRepository;

public interface RefBahanKaroseriRepo extends CrudRepository<RefBahanKaroseri, Integer> {
    
    List<RefBahanKaroseri> findAll();
    List<RefBahanKaroseri> findAllByOrderById();
    
}
