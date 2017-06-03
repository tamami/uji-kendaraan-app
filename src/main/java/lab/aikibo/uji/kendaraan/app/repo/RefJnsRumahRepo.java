package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.RefJnsRumah;
import lab.aikibo.uji.kendaraan.app.entity.RefJnsRumahPK;
import org.springframework.data.repository.CrudRepository;

public interface RefJnsRumahRepo extends CrudRepository<RefJnsRumah, RefJnsRumahPK> {
    
    List<RefJnsRumah> findAll();
    List<RefJnsRumah> findByIdJnsKendaraan(int idJnsKendaraan);
    
}
