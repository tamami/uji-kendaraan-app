package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.DatUser;
import org.springframework.data.repository.CrudRepository;

public interface DatUserRepo extends CrudRepository<DatUser, String> {
    
    List<DatUser> findAll();
    List<DatUser> findByUsername(String username);
    
}
